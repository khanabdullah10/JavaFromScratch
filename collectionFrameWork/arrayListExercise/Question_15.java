package src.collectionFrameWork.arrayListExercise;

//15. Write a Java program to join two array lists.

import java.util.ArrayList;
import java.util.List;

public class Question_15 {

    public static void main(String[] args) {

        List l = new ArrayList<>();

        l.add(10);
        l.add(9);
        l.add(8);
        l.add(7);



        List lst = new ArrayList<>();

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);

        List lstt = new ArrayList<>();

        lstt.addAll(lst);
        lstt.addAll(l);

        System.out.println(lstt);
    }




}
