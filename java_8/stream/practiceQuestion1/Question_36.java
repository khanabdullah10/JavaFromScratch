package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;

/**
 * Write Java 8 program to sort given list of strings according to decreasing order of their length?
 */
public class Question_36 {
    public static void main(String[] args) {

        List<String> l = Arrays.asList("Khan","Abdullah","Ubaid","ahmed");
        System.out.println(l.stream().sorted((s1,s2)->Integer.compare(s2.length(),s1.length())).toList());
    }
}

