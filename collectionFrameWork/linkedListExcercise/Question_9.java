package src.collectionFrameWork.linkedListExcercise;


//9. Write a Java program to insert some elements at the specified position into a linked list.

import java.util.Collections;
import java.util.LinkedList;

public class Question_9 {

    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);

        LinkedList<Object> ls = new LinkedList<>();
        ls.add(100);
        ls.add(200);
//        l.add(300);


        l.addAll(1,ls);
        System.out.println(l);


    }

}
