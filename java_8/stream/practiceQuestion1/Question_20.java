package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 20: Write a Java 8 program to find the sum of digits of a list of integers?
 */


public class Question_20 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        List<String> l1 = Arrays.asList("Khan", "Abdullah","Ubaid","Ahmed");


        System.out.println(l.stream().reduce(0,(a,b)-> a+b));
        System.out.println(l1.stream().map(s->s.length()).collect(Collectors.toUnmodifiableList()));
        System.out.println(l1.stream().map(s->s.length()).reduce(0,(x,y)->x+y));
    }
}
