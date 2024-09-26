package src.onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.PaymentFailedException;

import java.util.ArrayList;
import java.util.Date;

public class Order {

    private Customer customer;
    private ArrayList<Product> orderedItems;

    public Order(Customer customer){
        this.customer = customer;
        this.orderedItems = (ArrayList<Product>) customer.get().getItems();
    }

    public void placeOrder(){
        int count =0;
        System.out.println();
        System.out.println("***************************************");
        System.out.println("Order placed for customer: "+ customer);
        System.out.println("Ordered Items: ");
        System.out.println("=======================================");
        for(Product prod: orderedItems){
            System.out.println(prod);
            count++;
        }
        System.out.println("Total number of items that you have ordered are "+count);
    }

}
