package src.collectionFrameWork.arrayListExercise;



// Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.List;

public class Question_9{

    public static void main(String[] args) {
        List<Object> lst = new ArrayList<>();

        lst.add("Violet");
        lst.add("Indigo");
        lst.add("Blue");
        lst.add("Green");
        lst.add("Yellow");
        lst.add("Orange");
        lst.add("Red");

        List<Object> lst2 = new ArrayList<>();
        System.out.println(lst);

        lst2.addAll(lst);

        System.out.println(lst2);
    }
}
