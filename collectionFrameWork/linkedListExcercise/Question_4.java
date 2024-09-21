package src.collectionFrameWork.linkedListExcercise;


//4. Write a Java program to iterate a linked list in reverse order.


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Question_4 {

    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
//        Collections.reverse(l);

        Iterator<Object> itr = l.descendingIterator();
        System.out.print('[');
        while (itr.hasNext()){
            Object i = (Object) itr.next();
            System.out.print(i +" ");
        }
        System.out.print(']');

    }



}
