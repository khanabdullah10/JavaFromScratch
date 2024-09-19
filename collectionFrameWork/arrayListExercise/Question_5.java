package src.collectionFrameWork.arrayListExercise;

//5. Write a Java program to update an array element by the given element.

import java.util.ArrayList;
import java.util.List;

public class Question_5 {

    public static void main(String[] args) {

        List<Object> lst = new ArrayList<>();

        lst.add("Violet");
        lst.add("Indigo");
        lst.add("Blue");
        lst.add("Green");
        lst.add("Yellow");
        lst.add("Orange");
        lst.add("Red");


        System.out.println("Before Update the list are as follows :");
        System.out.println(lst);

        lst.set(6,"Black");
        System.out.println();
        System.out.println("List After Updation :");
        System.out.println(lst);

    }

}
