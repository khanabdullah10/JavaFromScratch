package com.genZ_Shopping.gen_z_shopping.service;

import com.genZ_Shopping.gen_z_shopping.model.Product;
import com.genZ_Shopping.gen_z_shopping.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final ProductRepository productRepository;

    public AdminService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        productRepository.update(product);
    }

    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }
}
