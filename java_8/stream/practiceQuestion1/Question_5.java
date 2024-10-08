package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;

/**
 * Question 5: Write a Java 8 program to find the sum of all even numbers in a list of integers ?
 */


public class Question_5 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,45,6);

        System.out.println(l.stream().filter(i->i%2==0).reduce(0,(a,b)->a+b));
    }
}
