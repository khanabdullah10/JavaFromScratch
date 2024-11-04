package com.ashokIT.springFundamentalConcepts.manuallyInjectingDependencies;

public class Upi implements Ipayment{


    @Override
    public String pay(double amount) {
        return "Paymentof "+amount+" is successful through UPI.... ";
    }
}
