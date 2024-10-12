package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 22: Write Java 8 program to find all the numbers starting with 2 in given list ?
 */

public class Question_22 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(223, 234, 145, 367, 289, 2001, 2289);
        System.out.println( l.stream()
                .filter(number -> String.valueOf(number).startsWith("2"))
                .collect(Collectors.toList()));

    }
}
