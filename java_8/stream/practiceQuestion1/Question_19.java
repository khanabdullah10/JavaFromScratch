package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Question 19: Write a Java 8 program to find the frequency of each word in a list of strings?
 */
public class Question_19 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Khan","Abdulla","Ubaid","Ahmed","Khan");
//        System.out.println(l.stream().flatMap(l->List.of("//s+").stream()).collect(Collectors.groupingBy(String::toLowerCase)));
    }
}
