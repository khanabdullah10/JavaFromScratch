package com.ashokIT.springFundamentalConcepts.tightCoupling;

public class Test {


    static Car c = new Car();

    static void test(){
        c.drive();
    }
    public static void main(String[] args) {

        /**
         * HAS-A Relation (Composition)
         */
        System.out.println("Composition");
        test();

        /**
         * IS-A relation (Inheritance)
         */
        System.out.println("Inheritance");
        Car car = new Car();
        car.drive();
    }
}
