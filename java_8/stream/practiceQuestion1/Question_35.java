package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Write Java 8 program to find a sum of all digits of a number
 */
public class Question_35 {

    public static int findSum(int n){
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {

        System.out.println(findSum(54321));
    }
}
