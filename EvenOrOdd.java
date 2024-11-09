package com.example;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to identify whether it is Even or Odd");
        int n = sc.nextInt();
        sc.nextLine();
//        if(n%2 != 0) System.out.println("The number is odd");
//        else System.out.println("The number is even");

        Object result = IntStream.of(n).mapToObj(num->num%2==0 ? num +" is even":num +" is Odd").findFirst().orElse("NO result");
        System.out.println(result);


    }

}
