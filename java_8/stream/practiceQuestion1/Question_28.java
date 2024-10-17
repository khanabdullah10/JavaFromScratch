package src.java_8.stream.practiceQuestion1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Question 28 : Write a Java 8 program to concatenate two Streams?
 */
public class Question_28 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        List<String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("E");
        list2.add("F");

        List<String> concatenatedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());

        System.out.println(concatenatedList);
    }
}
