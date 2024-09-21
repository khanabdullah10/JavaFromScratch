package src.collectionFrameWork.linkedListExcercise;

//15. Write a Java program that swaps two elements in a linked list.

import java.util.Collections;
import java.util.LinkedList;

public class Question_15 {

    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);


        Collections.swap(l,2,3);
        System.out.println(l);

    }

}
