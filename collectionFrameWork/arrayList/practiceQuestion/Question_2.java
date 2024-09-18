package src.collectionFrameWork.arrayList.practiceQuestion;


//2. Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.List;

public class Question_2 {

    public static void main(String[] args) {

        List lst = new ArrayList<>();

        lst.add(25);
        lst.add("Khan");
        lst.add("Abdullah");
        lst.add("Ubaid");
        lst.add("Ahmed");


        System.out.print("[");
        for(Object l : lst){
            System.out.print(l + " ");
        }
        System.out.print("]");

        System.out.println();

        System.out.println("\n"+ lst);
    }

}
