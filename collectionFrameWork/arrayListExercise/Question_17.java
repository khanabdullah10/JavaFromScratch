package src.collectionFrameWork.arrayListExercise;

//17. Write a Java program to empty an array list.

import java.util.ArrayList;
import java.util.List;

public class Question_17 {

    public static void main(String[] args) {
        List l = new ArrayList<>();

        l.add(10);
        l.add(9);
        l.add(8);
        l.add(7);


        l.removeAll(l);

        System.out.println(l);


    }




}
