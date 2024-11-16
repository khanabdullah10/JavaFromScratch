package com.practiceQuestions.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int i = sc.nextInt();

        int count = 1;

        // Traditional
        for (int j = 1; j <=i ; j++) {
            count *= j;
        }
        System.out.println("Factorial : "+ count);


        // Stream

        System.out.println( IntStream.rangeClosed(1, i).reduce(1,(a,b)->a*b));



    }



}
