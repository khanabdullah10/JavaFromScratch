package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_11 {

    public static void main(String[] args) {
        /*
         * Question 11: Write a Java
         * 8 program to remove duplicate elements from a list ?
         */

        List<Integer> nl = Arrays.asList(1,23,4,5,7,98,7,7,7);
        System.out.println(nl.stream().distinct().collect(Collectors.toList()));
    }
}
