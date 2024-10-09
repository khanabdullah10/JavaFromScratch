package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;

public class Question_9 {
    public static void main(String[] args) {
        /*
         * Question 9: Write a Java 8 program to check
         * if all elements in a list are greater than a given value?
         */

        List<Integer> l = Arrays.asList(1,2,3,4,5);
        System.out.println(l.stream().anyMatch(e->e > 4));
        System.out.println(l.stream().allMatch(e->e >4));

    }
}
