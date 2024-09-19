package src.collectionFrameWork.arrayListExercise;

import java.util.ArrayList;
import java.util.List;

//13. Write a Java program to compare two array lists.
public class Question_13 {

    public static void main(String[] args) {
        List lst = new ArrayList<>();
        List ls = new ArrayList<>();

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);


        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);

        System.out.println(lst.equals(ls));
    }
}
