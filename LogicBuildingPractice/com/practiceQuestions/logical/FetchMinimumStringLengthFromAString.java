package com.practiceQuestions.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FetchMinimumStringLengthFromAString {

    public static void main(String[] args) {


        List<String> l = Arrays.asList("Khan","Abdullah","Ubaid","Ahmed","Ahad");

        int minimumLength = l.stream().mapToInt(String::length).min().orElse(0);

        List<String> collect = l.stream().filter(s -> s.length() == minimumLength).collect(Collectors.toUnmodifiableList());

        System.out.println(collect);

    }

}
