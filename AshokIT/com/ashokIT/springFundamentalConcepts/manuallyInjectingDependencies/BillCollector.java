package com.ashokIT.springFundamentalConcepts.manuallyInjectingDependencies;

public class BillCollector {

    private Ipayment ipayment;

    //setter method injector
    public void setIpayment(Ipayment payment){
        this.ipayment = payment;
    }

    //constructor injector
    public BillCollector(Ipayment payment){
        this.ipayment = payment;
    }

    public BillCollector(){

    }


    public void collectPayment(double amount){
       String status =  ipayment.pay(amount);
        System.out.println(status);
    }
}
