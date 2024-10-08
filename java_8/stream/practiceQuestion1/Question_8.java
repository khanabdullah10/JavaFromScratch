package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;

/**
 * Question 8: Write a Java 8 program to count the occurrences of a given character in a
 * list of strings?
 */
public class Question_8 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Khan","Abdullah","Ubaid","Ahmed");
        System.out.println(l.stream()
                .flatMapToInt(CharSequence::chars)
                .filter(ch -> ch == 'a')
                .count());
    }
}
