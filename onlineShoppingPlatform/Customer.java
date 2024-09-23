package src.onlineShoppingPlatform;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Order> orderHistory = new ArrayList<>();

    public void placeOrder(Order order){
        orderHistory.add(order);
        System.out.println("Order has been placed successfully !");
    }

    public void viewOrderHistory(){
        System.out.println("Order History : ");
        for(Order odr : orderHistory) odr.viewOrder();
    }
}
