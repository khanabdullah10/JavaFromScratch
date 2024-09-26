package src.onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.ProductNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {

    private HashMap<String,Product> products = new HashMap<>();

    public void addProduct(Product prod){
        products.put(prod.getProductId(),prod);
    }

    public Product searchProduct(String productId)throws ProductNotFoundException{
        if(!products.containsKey(productId)){
            throw new ProductNotFoundException("[Product with ID "+ productId + " not found.]");
        }
        return products.get(productId);
    }

    public void showAllProducts(){
        System.out.println("Available Products:");
        System.out.println("============================================================================================");
        for(Product prod : products.values()){
            System.out.println(prod);
        }
    }


}
