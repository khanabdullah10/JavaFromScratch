package com.practiceQuestions.logical;

import java.util.ArrayList;
import java.util.List;

public class New {
    public static void main(String[] args) {
        List< String > fruits = new ArrayList< >();
        // Adding new elements to the ArrayList
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Grapes");

        System.out.println(fruits);

        // Remove the element at index `5`
        fruits.remove(5);
        System.out.println("After remove(5): " + fruits);
    }
}
