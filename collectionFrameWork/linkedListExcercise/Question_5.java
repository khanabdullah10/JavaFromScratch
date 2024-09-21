package src.collectionFrameWork.linkedListExcercise;



//5. Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.LinkedList;

public class Question_5 {

    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        System.out.println(l);
        l.add(5,60);
        System.out.println(l);

    }

}
