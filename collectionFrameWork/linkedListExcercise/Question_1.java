package src.collectionFrameWork.linkedListExcercise;


// 1. Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;

public class Question_1 {

    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        l.addFirst(0);
        l.addLast(60);
        System.out.println(l);


    }
}
