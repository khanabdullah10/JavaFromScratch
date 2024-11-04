package com.ashokIT.springFundamentalConcepts.manuallyInjectingDependencies;

public class DebitCard implements Ipayment{
    @Override
    public String pay(double amount) {
        return "Payment of "+amount+" is successful through Debit card...";
    }
}
