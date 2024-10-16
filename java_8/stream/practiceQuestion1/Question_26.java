package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *Question 26 : Write Java 8 program to sort all the values of the list in descending order?
 */
public class Question_26 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);

        System.out.println(l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toUnmodifiableList()));

    }
}
