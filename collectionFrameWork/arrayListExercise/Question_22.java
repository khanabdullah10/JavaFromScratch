package src.collectionFrameWork.arrayListExercise;

//21. Write a Java program to replace the second element of an ArrayList with the specified element.


import java.util.ArrayList;
import java.util.List;

public class Question_22 {

    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(10);
        l.add(9);
        l.add(8);
        l.add(7);

        System.out.println(l);

        l.set(3,6);
        System.out.println(l);


    }

}
