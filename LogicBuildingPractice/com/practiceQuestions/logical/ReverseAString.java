package com.practiceQuestions.logical;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAString {

    public static void main(String[] args) {

        String s = "KHAN";


        //traditional

        String s2 = "";

        for (int i = s.length()-1; i >= 0; i--) {
            s2 += s.charAt(i) ;

        }
        System.out.println(s2);


        // By Array
        char[] try1 = s.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
        System.out.println();

        //String Buffer
        StringBuffer ns = new StringBuffer(s);

        System.out.println(ns.reverse());



        //Stream Api

        System.out.println(Stream.of(s.split("")).reduce("",(a,b)->b+a));



    }

}
