package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;

/**
 * Question 4: Write a Java 8 program to check if a list contains a specific element ?
 */

public class Question_4 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,45,6);


        System.out.println(l.stream().anyMatch(n->n == 45));
    }
}
