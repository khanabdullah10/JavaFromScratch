package com.ashokIT.springFundamentalConcepts.tightCoupling;

public class Car extends Engine {

    void drive(){
        int status = super.start();
        if(status >=1 ){
            System.out.println("Journey started successfully...!");
        }else {
            System.out.println("Sorry there is an Engine error..");
        }
    }
}
