package src.collectionFrameWork.linkedListExcercise;


//16. Write a Java program to shuffle elements in a linked list.


import java.util.Collections;
import java.util.LinkedList;

public class Question_16 {

    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        Collections.shuffle(l);
        System.out.println(l);
    }

}
