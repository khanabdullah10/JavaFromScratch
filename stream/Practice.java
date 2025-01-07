package com.important.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1,2,3,4,5,6,1,2,3,4,7,9,9);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> set = l.stream().filter(n-> !seen.add(n)).collect(Collectors.toSet());
        System.out.println(set);

    }
}
