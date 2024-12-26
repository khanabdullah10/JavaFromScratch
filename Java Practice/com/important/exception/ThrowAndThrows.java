package com.important.exception;

public class ThrowAndThrows {

    void m1(int a , int b)  {
        if(b == 0 ) throw new ArithmeticException("b is zero");
        else {
           int  c = a / b;
            System.out.println(c);
        }

    }

    public static void main(String[] args) throws ArithmeticException {
        ThrowAndThrows t = new ThrowAndThrows();
        t.m1(10,2);


    }
}
