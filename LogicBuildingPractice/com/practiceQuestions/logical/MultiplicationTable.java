package com.practiceQuestions.logical;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print its multiplication");

        int i = sc.nextInt();

//        for (int j = 1; j < 11; j++) {
//            System.out.println(i+"x"+j+"="+i*j);
//        }


        IntStream.rangeClosed(1, 10)
                .forEach(j -> System.out.println(i + " x " + j + " = "+i*j));


    }
}
