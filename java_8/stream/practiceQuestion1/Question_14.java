package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_14 {

    public static void main(String[] args) {
        /**
         * Question 14: Write a Java 8 program to
         * sort a list of strings in alphabetical order ?
         */

        List<String> lst = Arrays.asList("Khan","Abdullah","Ubaid","Bhmed");

        System.out.println(lst.stream().sorted().collect(Collectors.toList()));
    }
}
