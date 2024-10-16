package src.java_8.stream.practiceQuestion1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Question 24: Write Java 8 program to count the total numbers of elements
 * in the given integers list ?
 */

public class Question_24 {

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1,2,3,4,5);
        System.out. println(l.stream().count());

    }


}
