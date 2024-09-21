package src.collectionFrameWork.linkedListExcercise;

import java.util.LinkedList;

//13. Write a Java program to remove the first and last elements from a linked list.
public class Question_13 {

    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
    }

}
