package java_8.stream.practiceQuestion1;

import java.util.Arrays;
import java.util.List;

public class Question_12 {
    public static void main(String[] args) {
        /*
         * Question 12: Write a Java
         * 8 program to find the longest string in a list of strings ?
         */

        List<String> lst = Arrays.asList("Khan","Abdullah","Ubaid","Bhmed");
        System.out.println(lst.stream().max((s1,s2)->s1.length()-s2.length()).get());
    }
}
