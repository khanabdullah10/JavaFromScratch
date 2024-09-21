package src.collectionFrameWork.linkedListExcercise;

//17. Write a Java program to join two linked lists.

import java.util.LinkedList;

public class Question_17 {
    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);

        LinkedList<Object> ls = new LinkedList<>();
        ls.add(60);
        ls.add(70);
        ls.add(80);
        ls.add(90);
        ls.add(100);
        System.out.println(ls);

        l.addAll(ls);
        System.out.println(l);

    }
}
