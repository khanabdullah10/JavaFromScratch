package src.collectionFrameWork.arrayList.practiceQuestion;

// Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;
import java.util.List;

public class Question_1 {
    public static void main(String[] args) {

        List lst = new ArrayList();

        lst.add("Violet");
        lst.add("Indigo");
        lst.add("Blue");
        lst.add("Green");
        lst.add("Yellow");
        lst.add("Orange");
        lst.add("Red");

        System.out.println("\nArray List of Colors : \n");
        System.out.println(lst);

    }
}
