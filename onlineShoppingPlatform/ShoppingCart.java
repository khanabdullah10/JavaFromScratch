package src.onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.OutOfStockException;
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> items = new ArrayList<>();

    public void addItem(Product prod) throws OutOfStockException {
        if (prod == null) throw new OutOfStockException("The product is out of stock or unavailable. ");
        else items.add(prod);
        System.out.println("[Added to the Cart : " + prod.getName()+"]");
    }

    public void viewCart() {
        int count = 0;
        if(items.isEmpty()) System.out.println("Your cart is empty.");
        System.out.println();
        System.out.println("Item in cart : ");
        System.out.println("=======================================");
        for (Product p : items){
            System.out.println(p.getProductId()+" "+ p.getName()+" "+ p.getPrice() +" ₹/- ");
            count++;
        }
        System.out.println("Total items are "+ count);
    }

    public List<Product> getItems(){
        return items;
    }

    public void clearCart(){
        items.clear();
    }


    public  double calculateTotal() {
        double total = 0;
        for(Product p : items) total+= p.getPrice();
        return total;
    }
}