package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_16 {

    public static void main(String[] args) {
        /**
         * Question 16: Write a Java 8 program to convert
         * a list of integers to a comma-separated string ?
         */

        List<String> lst = Arrays.asList("Khan","Abdullah","Ubaid","Bhmed");
        System.out.println(lst.stream().map(Object::toString).collect(Collectors.joining(",")));
    }
}
