package src.collectionFrameWork.linkedListExcercise;


//7. Write a Java program to insert the specified element at the front of a linked list.


import java.util.LinkedList;

public class Question_7 {

    public static void main(String[] args) {



        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);

        l.offerFirst(100);
        l.addFirst(200);
        System.out.println(l);

    }

}
