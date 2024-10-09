package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;

public class Question_15 {
    public static void main(String[] args) {
        /** Question 15: Write a Java 8 program to
         * calculate the average of even numbers in a list of integers ?
         */
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        System.out.println(l.stream().filter(e-> e%2 == 0).mapToInt(n->n).average().getAsDouble());
    }
}
