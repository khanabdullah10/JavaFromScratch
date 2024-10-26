package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.List;

/**
 *  Write Java 8 program to prints the first 5 odd numbers
 */
public class Question_39 {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        System.out.println(l.stream().filter(x->x%2 !=0).limit(5).toList());

    }
}
