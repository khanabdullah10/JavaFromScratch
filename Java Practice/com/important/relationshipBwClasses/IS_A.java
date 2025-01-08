package com.important.relationshipBwClasses;

/**
 * IS_A(Inheritance)
 * Relationship between two classes which indicates that one class is dependent on another
 * Classes are tightly couple
 */

class Bike{

}

class Pulsar extends Bike{
    Engine engine;
}

class Engine{

}



public class IS_A {
    public static void main(String[] args) {
        Pulsar pulsar = new Pulsar();
    }
}
