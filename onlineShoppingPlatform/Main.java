package src.onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.OutOfStockException;
import src.onlineShoppingPlatform.customException.PaymentFailedException;
import src.onlineShoppingPlatform.customException.ProductNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Admin admin = new Admin();
        Customer customer = new Customer();

        // Add new products to inventory by Admin
        admin.addProductToInventory(inventory, new Product("Laptop", 35000.0, "P001"));
        admin.addProductToInventory(inventory, new Product("Phone", 1800.0, "P002"));
        admin.addProductToInventory(inventory, new Product("Charger", 800.0, "P003"));
        admin.addProductToInventory(inventory, new Product("Headphone", 500.0, "P004"));

        // Display products in inventory
        System.out.println();
        inventory.displayProducts();
        System.out.println();
        // Customer adds items to shopping cart
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);


        String productId = null;
        try {
            System.out.println("Enter the product ID to add to cart:");
            productId = scanner.nextLine();
            Product product = inventory.getProductById(productId);
            cart.addItem(product);
        } catch (ProductNotFoundException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Place an order
        System.out.println("Choose payment method : (Credit card, Debit card, UPI ,COD)");
        String pm = scanner.nextLine();
        System.out.println("Choose Shipping method : (Standard, Express, Over Night)");
        String sm = scanner.nextLine();
        Order order = new Order(cart, productId, pm, sm);
        try {
            order.placeOrder();
        } catch (PaymentFailedException e) {
            System.out.println("Payment Error: " + e.getMessage());
        }

        // View Order History
        customer.placeOrder(order);
        customer.viewOrderHistory();
    }
}
