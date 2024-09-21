package src.collectionFrameWork.linkedListExcercise;



//6. Write a Java program to insert elements into the linked list at the first and last positions.


import java.util.LinkedList;

public class Question_6{

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
