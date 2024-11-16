package com.practiceQuestions.logical;

import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;



class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check for reference equality
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type
        Person person = (Person) obj; // Cast to Person
        return age == person.age && Objects.equals(name, person.name); // Check field equality
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Generate hash code based on fields
    }

}

public class CheckPrime {
    public static void main(String[] args) {

//        int b = 6;
//
//        IntStream.rangeClosed(1,(int)Math.sqrt(b)).noneMatch(i-> b)

    }
}
