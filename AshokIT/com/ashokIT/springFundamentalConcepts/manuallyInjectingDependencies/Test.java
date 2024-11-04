package com.ashokIT.springFundamentalConcepts.manuallyInjectingDependencies;

import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) throws Exception {

        System.out.println();

        /**
         * Setter
         */
        BillCollector bc = new BillCollector();
        bc.setIpayment(new CreditCard());
        bc.collectPayment(15000);

        /**
         * Constructor
         */
        BillCollector bcc = new BillCollector(new Upi());
        bcc.collectPayment(12000);


        /**
         * Field
         */


        /**
         * Example of accessing private field
         */

        Class<?> clzz = Class.forName("com.ashokIT.springFundamentalConcepts.manuallyInjectingDependencies.BillCollector");
        Object obj = clzz.newInstance();

        BillCollector bbcc = (BillCollector) obj;

        Field field = clzz.getDeclaredField("ipayment");
        field.setAccessible(true);

        field.set(obj,new DebitCard());
        bbcc.collectPayment(2500);

    }


}
