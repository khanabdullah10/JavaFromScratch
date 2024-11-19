package com.genZ_Shopping.gen_z_shopping.service;

import com.genZ_Shopping.gen_z_shopping.exception.CartEmptyException;
import com.genZ_Shopping.gen_z_shopping.exception.InvalidOrderException;
import com.genZ_Shopping.gen_z_shopping.exception.ProductNotFoundException;
import com.genZ_Shopping.gen_z_shopping.model.*;
import com.genZ_Shopping.gen_z_shopping.repository.CartRepository;
import com.genZ_Shopping.gen_z_shopping.repository.OrderRepository;
import com.genZ_Shopping.gen_z_shopping.repository.ProductRepository;
import com.genZ_Shopping.gen_z_shopping.repository.ShippingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final ProductRepository productRepository;
    private final CartRepository cartRepository;
    private final OrderRepository orderRepository;
    private final ShippingRepository shippingRepository;

    public UserService(ProductRepository productRepository, CartRepository cartRepository,
                       OrderRepository orderRepository, ShippingRepository shippingRepository) {
        this.productRepository = productRepository;
        this.cartRepository = cartRepository;
        this.orderRepository = orderRepository;
        this.shippingRepository = shippingRepository;
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Search for products by keyword
    public List<Product> searchProducts(String keyword) {
        return productRepository.findAll().stream()
                .filter(product -> product.getStock() > 0) // Ensure product is available
                .filter(product -> product.getName().toLowerCase().contains(keyword.toLowerCase())) // Match the keyword
                .collect(Collectors.toList());
    }

    // Add an item to the cart
    public void addToCart(CartItemRequest cartItemRequest) {
        // Fetch the product from the repository
        Product product = productRepository.findById(cartItemRequest.getProductId());
        if (product == null) {
            throw new ProductNotFoundException("Product not found with ID: " + cartItemRequest.getProductId());
        }

        // Check stock availability
        if (cartItemRequest.getQuantity() > product.getStock()) {
            throw new InvalidOrderException("Insufficient stock for product: " + product.getName());
        }

        // Create a CartItem object from the CartItemRequest
        CartItem cartItem = new CartItem();
        cartItem.setProductId(cartItemRequest.getProductId());
        cartItem.setQuantity(cartItemRequest.getQuantity());

        // Add the item to the cart
        cartRepository.addItemToCart(cartItem);

        // Reduce the product stock and update the product in the repository
        product.setStock(product.getStock() - cartItemRequest.getQuantity());
        productRepository.updateProductStock(product.getId(), product.getStock());
    }

    // Place an order
    public String placeOrder(OrderRequest orderRequest) {
        // Get all items from the cart
        List<CartItem> cartItems = cartRepository.getAllCartItems();

        // Validate if cart is empty
        if (cartItems.isEmpty()) {
            throw new CartEmptyException("Cart is empty. Add items to the cart before placing an order.");
        }

        // Calculate the total amount
        double totalAmount = cartItems.stream()
                .mapToDouble(item -> {
                    Product product = productRepository.findById(item.getProductId());
                    if (product == null) {
                        throw new ProductNotFoundException("Product not found with ID: " + item.getProductId());
                    }
                    return product.getPrice() * item.getQuantity(); // Calculate total cost
                })
                .sum();

        // Generate order ID
        String orderId = UUID.randomUUID().toString();
        Order order = new Order();
        order.setOrderId(orderId);
        order.setTotalAmount(totalAmount);
        order.setOrderDate(LocalDateTime.now());
        // Current date-time for order

        // Save the order to the database
        orderRepository.saveOrder(order);

        // Save shipping details
        Shipping shipping = new Shipping();
        shipping.setOrderId(orderId); // Link order ID
        shipping.setShippingMethod(orderRequest.getShippingMethod()); // Shipping method from request
        shippingRepository.saveShipping(shipping);

        // Clear the cart after placing the order
        cartRepository.clearCart();

        // Return the order ID as confirmation
        return orderId;
    }

    // View order history
    public List<Order> getOrderHistory() {
        return orderRepository.getAllOrders();
    }

    // Track shipping information for a given order ID
    public Shipping trackShipping(String orderId) {
        Shipping shipping = shippingRepository.findByOrderId(orderId);
        if (shipping == null) {
            throw new InvalidOrderException("No shipping details found for Order ID: " + orderId);
        }
        return shipping;
    }
}
