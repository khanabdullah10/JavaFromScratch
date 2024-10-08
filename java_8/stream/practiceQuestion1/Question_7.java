package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 7: Write a Java 8 program to find the average length of strings in a list of strings?
 */
public class Question_7 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Khan","Abdullah","Ubaid","Ahmed");
        System.out.println(l.stream().mapToInt(String::length).average().getAsDouble());
    }
}
