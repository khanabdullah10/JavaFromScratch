package src.collectionFrameWork.linkedListExcercise;

//18. Write a Java program to copy a linked list to another linked list.


import java.util.LinkedList;

public class Question_18 {

    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        LinkedList<Object> ls =  (LinkedList<Object>)l.clone();

        System.out.println(ls);
    }

}
