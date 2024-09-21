package src.collectionFrameWork.linkedListExcercise;


//12. Write a Java program to remove a specified element from a linked list.


import java.util.LinkedList;

public class Question_12 {

    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        System.out.println(l);
       l.remove(2);
        System.out.println(l);
        l.remove();
        System.out.println(l);
        l.clear();
        System.out.println(l);
    }

}
