package src.java_8.stream.practiceQuestion1;

import java.util.stream.IntStream;

public class Question_10 {
    public static void main(String[] args) {
        /**
         * Question 10: Write a Java 8 program to find
         * the factorial of a given number ?
         */

        System.out.println(IntStream.rangeClosed(1,5).reduce((a, b)->a*b).getAsInt());

    }
}
