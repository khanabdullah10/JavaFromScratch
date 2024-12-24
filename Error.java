package com.important.exception;

public class Error {

    /**
     * StackOverFlow
     */
    void m1(){
        System.out.println("m1");
        m2();
    }
    void m2(){
        System.out.println("m2");
        m1();
    }

    public static void main(String[] args) {
//        Error er = new Error();
//        er.m1();

        /**
         * OutOfMemory
         */
        int[] arr = new int[100000 * 100000];
        System.out.println(arr[0]);

    }
}
