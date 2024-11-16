package com.practiceQuestions.logical;

import java.util.stream.IntStream;

public class PrintEvenNumber {

    public static void main(String[] args) {

        IntStream.rangeClosed(1,20).filter(n-> n%2==0).forEach(System.out::println);

    }

}
