package src.collectionFrameWork.arrayListExercise;

//11. Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_11 {

    public static void main(String[] args) {
        List lst = new ArrayList<>();

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);

        System.out.println("list before reverse operation :");
        System.out.println(lst);
        System.out.println("list after reverse operation :");
        Collections.reverse(lst);
        System.out.println(lst);


    }
}
