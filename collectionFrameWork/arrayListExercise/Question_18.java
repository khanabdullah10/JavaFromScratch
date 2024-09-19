package src.collectionFrameWork.arrayListExercise;

//18. Write a Java program to test whether an array list is empty or not.

import java.util.ArrayList;
import java.util.List;

public class Question_18 {

    public static void main(String[] args) {

        List l = new ArrayList<>();

        l.add(10);
        l.add(9);
        l.add(8);
        l.add(7);

        System.out.println(l.isEmpty());


    }


}
