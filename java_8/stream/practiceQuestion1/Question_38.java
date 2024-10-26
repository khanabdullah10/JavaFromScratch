package src.java_8.stream.practiceQuestion1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *Write Java 8 program to sort a given list of strings according to decreasing order of their length?
 */
public class Question_38 {
    public static void main(String[] args) {

        List<String> l = Arrays.asList("Khana","Abdullah","Ubaid","Ahmed");
        System.out.println(l.stream().sorted((s1,s2)->Integer.compare(s2.length(),s1.length())).toList());
        System.out.println(l.stream().sorted(Comparator.reverseOrder()).toList());
    }

}
