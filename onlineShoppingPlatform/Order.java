package src.onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.PaymentFailedException;

import java.util.Date;

public class Order {

    private ShoppingCart cart;
    private String orderID;
    private String paymentMethod;
    private String shippingMethod;
    private Date orderDate;
    private boolean isPaid;


    public Order(ShoppingCart cart, String orderID, String paymentMethod, String shippingMethod) {
        this.cart = cart;
        this.orderID = orderID;
        this.paymentMethod = paymentMethod;
        this.shippingMethod = shippingMethod;
        this.orderDate = new Date();
        this.isPaid = false;
    }



    public void placeOrder()throws PaymentFailedException {
        Payment payment = new Payment();
        double totalAmount = cart.calculateTotal();
        payment.processPayment(paymentMethod,totalAmount);
        isPaid = true;
        System.out.println("Order placed successfully with ID : "+orderID);
    }


    public void viewOrder(){
        System.out.println("Order Id: "+ orderID);
        System.out.println("Payment method: "+paymentMethod);
        System.out.println("Shipping method: "+shippingMethod);
        cart.viewCart();

    }



}
