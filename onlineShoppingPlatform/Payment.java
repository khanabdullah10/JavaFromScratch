package src.onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.PaymentFailedException;

public class Payment {

    public static void processPayment(String paymentMethod, double amount) throws PaymentFailedException {
        if(paymentMethod.equalsIgnoreCase("credit card") || paymentMethod.equalsIgnoreCase("Debit card")){
            System.out.println("Processing "+paymentMethod +" payment of  - ₹ "+ amount);
        } else if(paymentMethod.equalsIgnoreCase("COD") || paymentMethod.equalsIgnoreCase("UPI")) {
            System.out.println("Processing "+paymentMethod +" payment of  - ₹ "+ amount);
        } else {
            throw new PaymentFailedException("Payment method not accepted");
        }
    }
}
