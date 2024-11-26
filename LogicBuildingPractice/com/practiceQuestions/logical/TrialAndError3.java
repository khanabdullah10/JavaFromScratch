package com.practiceQuestions.logical;

import java.util.stream.IntStream;

public class TrialAndError3 {

    public static int digitSum(int n){
        int sum = 0 , rem = 0;

        while (n>0){
            rem = n%10;
            sum += rem;
            n=n/10;
        }

        return sum;
    }



    public static void main(String[] args) {

        System.out.println(digitSum(123));

//        IntStream.of()

    }
}
