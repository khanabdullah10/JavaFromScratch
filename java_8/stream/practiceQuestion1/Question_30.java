package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;

/**
 * Question 30: Write Java 8 program to separate odd and even numbers from the given list of integers?
 */

public class Question_30 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 55, 66, 88, 99);
        l.stream().filter(n->n%2==0).forEach(System.out::println);
        System.out.println();
        l.stream().filter(n->n%2!=0).forEach(System.out::println);
    }
}
