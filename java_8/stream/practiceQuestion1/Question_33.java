package src.java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Question 33: Write Java 8 program to merge two unsorted arrays into single sorted array by removing duplicates?
 */
public class Question_33 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList( 2, 3,3,4,5, 4, 5,  7, 8, 9,  11, 12, 55, 66, 88);
        List<Integer> l1 = Arrays.asList(99,10,6,1, 10,6,1);

        List<Integer> l3 = Stream.concat(l.stream().sorted(),l1.stream().sorted()).distinct().toList();
        System.out.println(l3);
    }

}
