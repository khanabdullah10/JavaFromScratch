package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Question 1: Write a Java 8 program to filter even numbers from a list
 */

public class Question_1 {
    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1,2,3,4,5);
        List<Integer> nl = evenList(l);
        System.out.println(nl);

    }


    public static  List<Integer> evenList(List<Integer> num ){
        return num.stream().filter(n->n%2==0).collect(Collectors.toUnmodifiableList());
    }
}
