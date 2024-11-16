package com.practiceQuestions.logical;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DemoTry {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream = stringList.stream();

        stream.forEach( element -> { System.out.println(element); });
    }
}
