package java8.streamAPI.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "pear", "kiwi", "grape");

        int minLength = strings.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);


        List<String> minLengthStrings = strings.stream()
                .filter(s -> s.length() == minLength)
                .collect(Collectors.toList());

        System.out.println("Strings with minimum length: " + minLengthStrings);

    }
}
