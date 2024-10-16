package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 25 : Write Java 8 program to sort all the values of the list in ascending order?
 */

public class Question_25 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5,4,3,2,1);
        List<String> nl = Arrays.asList("khan","abdulla","ubaid","ahmed");
        System.out.println(l.stream().sorted().collect(Collectors.toUnmodifiableList()));
        System.out.println(nl.stream().sorted().collect(Collectors.toUnmodifiableList()));

    }
}
