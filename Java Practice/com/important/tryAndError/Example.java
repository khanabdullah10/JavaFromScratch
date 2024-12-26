package com.important.tryAndError;

public class Example {

    String s1 = "Outer class";
    class InnerClass{
        String s = "Innner class";

    }

     static public void main(String[] args) {
        Example ex = new Example();
        Example.InnerClass in = ex.new InnerClass();
        System.out.println(ex.s1);
        System.out.println(in.s);
    }

}
