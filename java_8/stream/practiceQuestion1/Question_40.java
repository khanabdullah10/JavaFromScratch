package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;

/**
 * Question 40 : Write Java 8 program to print the most repeated element in an array?
 */
public class Question_40 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,12,13,14,5,6,7,8,9,10,11,12,13,14,15);
        System.out.println(l.stream().filter(n->n==n).toList());
    }
}
