package com.practiceQuestions.logical;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TrialAndError1 {

    public static int fact(int n){
        int sum = 1;
        for (int i= 1; i <=n;i++) sum*= i;
        return sum;
    }


    public static void main(String[] args) {
        int n = 5;

        System.out.println(fact(5));

        OptionalInt reduce = IntStream.rangeClosed(1, n).reduce((a, b) -> a * b);
        System.out.println(reduce.getAsInt());

    }
}
