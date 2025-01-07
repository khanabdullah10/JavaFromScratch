package com.important.relationshipBwClasses;

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
