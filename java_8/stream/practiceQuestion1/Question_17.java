package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;

/**
 * Question 17: Write a Java 8 program to find the last element in a list ?
 */
public class Question_17 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);

        System.out.println(l.stream().reduce((first, second) -> second).get());


    }
}
