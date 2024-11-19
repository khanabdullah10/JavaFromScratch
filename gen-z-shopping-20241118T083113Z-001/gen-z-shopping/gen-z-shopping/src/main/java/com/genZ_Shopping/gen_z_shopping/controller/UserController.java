package com.genZ_Shopping.gen_z_shopping.controller;

import com.genZ_Shopping.gen_z_shopping.model.*;
import com.genZ_Shopping.gen_z_shopping.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("viewAll")
    public List<Product> viewAllProducts(){
        return userService.getAllProducts();
    }
    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String keyword) {
        return userService.searchProducts(keyword);
    }

    @PostMapping("/cart")
    public String addToCart(@Valid @RequestBody CartItemRequest cartItemRequest) {
        userService.addToCart(cartItemRequest);
        return "Item added to cart successfully.";
    }

    // Place an order
    @PostMapping("/orders")
    public String placeOrder(@Valid @RequestBody OrderRequest orderRequest) {
        String orderId = userService.placeOrder(orderRequest);
        return "Order placed successfully. Order ID: " + orderId;
    }

    // View order history
    @GetMapping("/orders")
    public List<Order> getOrderHistory() {
        return userService.getOrderHistory();
    }

    // Track shipping
    @GetMapping("/orders/{orderId}/shipping")
    public Shipping trackShipping(@PathVariable String orderId) {
        return userService.trackShipping(orderId);
    }





}
