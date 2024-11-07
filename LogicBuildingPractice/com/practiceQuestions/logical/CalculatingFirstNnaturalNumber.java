package com.practiceQuestions.logical;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CalculatingFirstNnaturalNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");

        int n = sc.nextInt();

        int count = 0;

//        for (int i = 1; i <= n; i++) {
//            count += i;
//        }
//        System.out.println("Sum :"+count);


        System.out.println(IntStream.rangeClosed(1,n).sum());


    }



}
