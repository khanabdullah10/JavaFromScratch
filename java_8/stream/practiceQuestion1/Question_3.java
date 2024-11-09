package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Question 3: Write a Java 8 program to find the maximum element from a list ?
 */
public class Question_3 {

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1,2,3,45,6);
        Optional<Integer> nl = l.stream().max(Integer::compareTo);
        Optional<Integer> nll = l.stream().min(Integer::compareTo);
        System.out.println(nl.get());
        System.out.println(nll.get());
    }
}
