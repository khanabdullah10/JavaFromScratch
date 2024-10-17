package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;

/**
 * Question 27 : Write Java 8 program to check if given integer
 * array contains duplicate or not. Return true if it contains duplicate character.
 */
public class Question_27 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        boolean b = Arrays.stream(nums).boxed().distinct().count() != nums.length;
        System.out.println(b);


    }

}
