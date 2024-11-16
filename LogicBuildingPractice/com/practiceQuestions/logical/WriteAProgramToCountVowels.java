package com.practiceQuestions.logical;

import java.util.stream.Stream;

public class WriteAProgramToCountVowels {

    public static void main(String[] args) {

        String s =  "khanabdullaubaidahmed";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== 'a'|| s.charAt(i)== 'e'|| s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)== 'u'){
                count++;
            }
        }
        System.out.println("number of vowels in a list are "+ count
        );



//        Stream.of(s.split("")).filter(s1 -> s.equals('a')||)



    }
}
