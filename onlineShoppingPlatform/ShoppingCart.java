package src.onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.OutOfStockException;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> items = new ArrayList<>();

    public void addItem(Product prod) throws OutOfStockException {
        if (prod == null) throw new OutOfStockException("The product is out of stock or unavailable. ");
        else items.add(prod);
        System.out.println("Added to the Cart : " + prod.getName());
    }

    public void viewCart() {
        System.out.println("Item in cart : ");
        for (Product p : items) System.out.println(p.getName() + " -₹ " + p.getPrice());
    }


    public double calculateTotal() {
        double total = 0;
        for(Product p : items) total+= p.getPrice();
        return total;
    }
}