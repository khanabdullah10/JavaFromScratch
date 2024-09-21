package src.collectionFrameWork.linkedListExcercise;


// 11. Write a Java program to display elements and their positions in a linked list.

import java.util.LinkedList;

public class Question_11 {

    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        for (int i = 0; i < l.size(); i++) {
            System.out.print(" "+i+" ");
        }
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+" ");
        }
    }

}
