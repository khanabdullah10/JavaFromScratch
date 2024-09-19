package src.collectionFrameWork.arrayListExercise;

//20. Write a Java program to increase the array list size.


import java.util.ArrayList;
import java.util.List;

public class Question_20 {

    public static void main(String[] args) {
        List lst = new ArrayList<>(10);

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(10);
        lst.add(9);
        lst.add(8);
        lst.add(7);
        lst.add(11);
        lst.add(11);
        lst.add(11);

        System.out.println(lst);

    }

}
