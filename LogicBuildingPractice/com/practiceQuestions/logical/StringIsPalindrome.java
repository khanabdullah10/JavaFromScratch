package com.practiceQuestions.logical;

import java.util.stream.Stream;

public class StringIsPalindrome {

    public static void main(String[] args) {


//        int num = 454;
//        int remainder, sum =0;
//        int temp = num;
//
//        while (num>0){
//            remainder = num % 10;
//            sum = (sum * 10) + remainder;
//            num /= 10;
//
//        }
//
//        if(temp == sum) System.out.println("is Palindrome");
//        else System.out.println("is not Palindrome");

        String s = "MOM";
        String original = "";
        String reverse = "";
        original = s;
        int length = s.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse += s.charAt(i);

        if(original.equals(reverse)) System.out.println("String is palindrome");
        else System.out.println("String is not palindrome");



// USing Stream API

        Boolean isPalindrome = s.equals(Stream.of(s.split("")).reduce("",(a,b)->b+a));

        if(isPalindrome == true) System.out.println("is Palindrome");
        else System.out.println("not Palindrome");


    }



}
