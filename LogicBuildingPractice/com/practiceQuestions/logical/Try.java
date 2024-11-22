package com.practiceQuestions.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Try {

    public static void main(String[] args) {

        String s = "khan.abdullah.ubaid.ahmed";

        // Split the string into an array and reverse it directly
        String[] parts = s.split("\\.");

        for (int i = 0; i < parts.length; i++) {
            System.out.print(parts[i]);
        }

        String reversedString = "";

        // Reverse the parts and concatenate them
        for (int i = parts.length - 1; i >= 0; i--) {
            reversedString += parts[i];
            if (i != 0) {
                reversedString += ".";
            }
        }
        System.out.println();
        // Print the reversed string
        System.out.println(reversedString);

    }
}
