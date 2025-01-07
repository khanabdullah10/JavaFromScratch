package com.important.flowOfExecution;

class Trial{
    {
        System.out.println("Trial init block");
    };

    static {
        System.out.println("Trial static block");
    }

    Trial(){
        System.out.println("Trial constructor");
    }

}

public class Example {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("init block");
    }
    Example(){
        System.out.println("Constructor");
    }

    void method(){
        System.out.println("Method invoke-cation");
    }


    public static void main(String[] args) {
        Example ex = new Example();
        Trial t = new Trial();
        System.out.println("main method");
        ex.method();
    }
}
