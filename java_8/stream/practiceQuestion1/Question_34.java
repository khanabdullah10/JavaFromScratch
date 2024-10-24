package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java program to get the first three maximum numbers and three minimum numbers from the given list of integers?
 */
public class Question_34 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        System.out.println(l.stream().sorted((a,b)->Integer.compare(b,a)).limit(3).collect(Collectors.toUnmodifiableList()));
        System.out.println(l.stream().sorted().limit(3).collect(Collectors.toUnmodifiableList()));
    }
}
