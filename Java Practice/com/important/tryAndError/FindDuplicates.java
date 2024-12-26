package com.important.tryAndError;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        // Sample list with duplicate elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 6, 7, 3);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n))  // If add returns false, the element is a duplicate
                .collect(Collectors.toSet());  // Collect the duplicates into a set

        System.out.println("Duplicate elements: " + duplicates);
    }
}
