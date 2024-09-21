package src.collectionFrameWork.linkedListExcercise;


//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.


import java.util.Collections;
import java.util.LinkedList;

public class Question_10 {

    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);

        l.add(30);
        l.add(30);
        l.add(30);

        l.add(40);
        l.add(50);
        l.add(50);


        System.out.println(Collections.frequency(l,30));


    }


}
