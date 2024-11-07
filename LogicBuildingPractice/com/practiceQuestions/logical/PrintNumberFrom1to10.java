package com.practiceQuestions.logical;

import java.util.List;
import java.util.stream.IntStream;

public class PrintNumberFrom1to10 {

    public static void main(String[] args) {

//        for (int i = 1; i < 11; i++) {
//            System.out.println(i);
//        }

        IntStream.rangeClosed(1,10).forEach(System.out::println);


    }

}
