package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;

/**
 * Question 23: Write Java 8 program to find the first element of the given integers list ?
 */

public class Question_23 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(223, 234, 145, 367, 289, 2001, 2289);

        System.out.println(l.stream().findFirst().get());
    }
}
