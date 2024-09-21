package src.collectionFrameWork.linkedListExcercise;


//2. Write a Java program to iterate through all elements in a linked list.

import java.util.LinkedList;
import java.util.ListIterator;

public class Question_2 {

    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);


        ListIterator<Object> itr = l.listIterator();
        System.out.print("[");
        while (itr.hasNext()){
            Integer i = (Integer)itr.next();
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
