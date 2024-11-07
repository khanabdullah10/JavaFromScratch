package com.practiceQuestions.logical;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NegativeOrPositive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a Number:");
        int i = sc.nextInt();

//        if(i<0) System.out.println("The number is negative");
//        else if (i==0) System.out.println("The number is equal to zero");
//        else System.out.println("The number is positive");

        Stream.of(i)
                .map(num -> {
                    if (num < 0) {
                        return "The number is negative";
                    } else if (num == 0) {
                        return "The number is equal to zero";
                    } else {
                        return "The number is positive";
                    }
                })
                .forEach(System.out::println);
    }


}
