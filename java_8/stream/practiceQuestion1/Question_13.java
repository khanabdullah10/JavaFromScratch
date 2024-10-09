package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_13 {
    public static void main(String[] args) {
        /**
         Question 13: Write a Java 8 program to convert all
         strings to uppercase in a list ?
         *
         */

        List<String> lst = Arrays.asList("Khan","Abdullah","Ubaid","Bhmed");
        System.out.println(lst.stream().map(s->s.toUpperCase()).collect(Collectors.toList()));
    }
}
