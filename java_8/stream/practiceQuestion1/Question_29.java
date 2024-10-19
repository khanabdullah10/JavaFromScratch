package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 29: Write Java 8 program to perform square on list elements and filter numbers greater than 1000.
 */
public class Question_29 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 55, 66, 88, 99);

        System.out.println(l.stream().map(n -> n * n).filter(n-> n>1000).collect(Collectors.toUnmodifiableList()));
    }
}
