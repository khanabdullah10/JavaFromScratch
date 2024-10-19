package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 31: Write Java 8 program to print the numbers which are multiples of 3?
 */
public class Question_31 {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 55, 66, 88, 99);

        System.out.println(l.stream().filter(n->n%3==0).collect(Collectors.toUnmodifiableList()));
    }

}
