package src.collectionFrameWork.linkedListExcercise;

//20. Write a Java program to retrieve, but not remove, the first element of a linked list.


import java.util.LinkedList;

public class Question_20 {

    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        System.out.println(l.getFirst());
    }

}
