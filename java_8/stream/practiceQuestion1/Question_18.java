package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;

/***
 * Question 18: Write a Java 8 program to find the second smallest element in a list of integers ?
 */
public class Question_18 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);

        System.out.println(l.stream().skip(1).findFirst().get());


    }
}
