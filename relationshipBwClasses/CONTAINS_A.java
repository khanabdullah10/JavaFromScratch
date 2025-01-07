package com.important.relationshipBwClasses;
class Engines {
    void start(){
        System.out.println("Engine starts");
    }
}

class Car{
    Engines eg = new Engines() ;
     void drive(){
         eg.start();
         System.out.println("car runs");
     }
}
//strongly coupled
public class CONTAINS_A {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
