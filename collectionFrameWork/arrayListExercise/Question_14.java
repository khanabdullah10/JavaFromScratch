package src.collectionFrameWork.arrayListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//14. Write a Java program that swaps two elements in an array list.
public class Question_14 {

    public static void main(String[] args) {
        List l = new ArrayList<>();

        l.add("khan");
        l.add("Abdullah");
        l.add("Ahmed");
        l.add("Ubaid");

        System.out.println(l);

        Collections.swap(l,2,3);
        System.out.println(l);


    }

}
