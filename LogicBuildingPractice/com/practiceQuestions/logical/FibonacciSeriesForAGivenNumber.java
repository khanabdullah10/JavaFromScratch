package com.practiceQuestions.logical;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FibonacciSeriesForAGivenNumber {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();


        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= num;i++){
            sum = a+b;
            System.out.println(a);
            a=b;
            b=sum;

        }

    }

}
