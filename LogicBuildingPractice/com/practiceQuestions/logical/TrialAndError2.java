package com.practiceQuestions.logical;



public class TrialAndError2 {

    public static int rev(int n){
        int sum = 0,rem = 0;

        while(n>0){
            rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int n = 123;
        System.out.println(rev(n));


        String s = String.valueOf(n);
        StringBuffer reverse = new StringBuffer(s).reverse();
        System.out.println(reverse);


    }
}
