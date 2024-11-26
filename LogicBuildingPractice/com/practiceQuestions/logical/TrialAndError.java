package com.practiceQuestions.logical;

import java.util.stream.IntStream;

public class TrialAndError {
    public static void isPrime(int n) {

        if (n <= 1) {
            System.out.println(n + " is not prime");
            return;
        }

        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }


        String result = (flag) ? n + " is prime" : n + " is not prime";
        System.out.println(result);
    }


    public static void main(String[] args) {

        int n = 5;

        isPrime(n);
        boolean b = IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
        System.out.println(b);

    }

}
