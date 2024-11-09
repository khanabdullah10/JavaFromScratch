package com.example;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LargestBw3Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digits");
        int x = sc.nextInt();
        sc.nextLine();
        int y = sc.nextInt();
        sc.nextLine();
        int z = sc.nextInt();
        sc.nextLine();

//        if(x>y&&x>z) System.out.println(z+" is the largest");
//        else if (y>x&&y>z) System.out.println(y + " is the largest");
//        else System.out.println(z+" is the largest");


        int largest = IntStream.of(x,y,z).max().orElseThrow();
        System.out.println(largest +" is the largest among other");
    }

}
