package src.onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.ProductNotFoundException;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product prod){
        products.add(prod);
    }

    public Product getProductById(String productId) throws ProductNotFoundException {

        for(Product prod : products){
            if(prod.getProductId().equals(productId)) return prod;
        }
        throw new ProductNotFoundException("Product with ID : "+ productId + " not found.");
    }

    public void displayProducts() {
        System.out.println("Available Products : ");
        System.out.println();
        for (Product prod: products){
            System.out.println(prod.getName() + " -₹ " + prod.getPrice() +" ID->"+ prod.getProductId());
        }
    }
}
