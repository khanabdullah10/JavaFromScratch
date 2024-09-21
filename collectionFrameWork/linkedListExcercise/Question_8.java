package src.collectionFrameWork.linkedListExcercise;

//8. Write a Java program to insert the specified element at the end of a linked list.


import java.util.LinkedList;

public class Question_8 {

    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);

        l.offerLast(100);
        l.addLast(200);
        System.out.println(l);
    }

}
