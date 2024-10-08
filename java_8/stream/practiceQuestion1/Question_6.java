package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;

/**
 * Question 6: Write a Java 8 program to concatenate all strings in a list ?
 */
public class Question_6 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Khan","Abdullah","Ubaid","Ahmed");
        System.out.println(l.stream().reduce((a,b)->a+b).get());
    }
}
