package src.onlineShoppingPlatform;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ShoppingCart cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
    }
    public ShoppingCart get(){
        return cart;
    }

    public String toString(){
        return name;
    }

}
