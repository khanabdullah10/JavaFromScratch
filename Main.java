package com.example;




class Swap{
    int a ;
    int b;


    public void set(int a, int b){
        this.a = a;
        this.b = b;
    }

    public  void swap(int a , int b){
        this.b= a;
        this.a= b;
    }
}

public class Main {
    public static void main(String[] args) {

        Swap s = new Swap();

        s.set(10,20);

        System.out.println("a = "+s.a);
        System.out.println("b = "+s.b);

       s.swap(20,10);

        System.out.println("a = "+s.a);
        System.out.println("b = "+s.b);

    }
}