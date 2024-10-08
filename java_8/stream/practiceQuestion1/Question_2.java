package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Question 2: Write a Java 8 program to calculate the sum of integers in a list ?
 */
public class Question_2 {

    public static void main(String[] args) {

        List<Integer> l =Arrays.asList(1,2,3,4,5);
        Integer nl = l.stream().reduce(0, (a, b) -> a + b);
        System.out.println(nl);

    }
}
