package com.genZ_Shopping.gen_z_shopping.controller;


import com.genZ_Shopping.gen_z_shopping.model.Product;
import com.genZ_Shopping.gen_z_shopping.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return adminService.getAllProducts();
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product) {
        adminService.addProduct(product);
        return "Product Added Successfully !";
    }

    @PutMapping("/products")
    public String updateProduct(@RequestBody Product product) {
        adminService.updateProduct(product);
        return "Product updated successfully";
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        adminService.deleteProductById(id);
        return "Product with id: " + id + " deleted successfully";
    }
}
