package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 21: Write a Java 8 program to find the distinct characters in a list of strings ?
 */
public class Question_21 {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Khan", "Abdullah","Ubaid","Ahmed");
        System.out.println(l1.stream().flatMap(s->s.chars().mapToObj(c->(char)c)).distinct().collect(Collectors.toUnmodifiableList()));

    }
}
