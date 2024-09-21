package src.collectionFrameWork.linkedListExcercise;



//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.LinkedList;

public class Question_3 {


    static void iterateFromSpecifiedPosition(LinkedList<Object> l , int s, int e) throws RuntimeException{
       try {
           if (e > l.size()) ;
       }catch(IndexOutOfBoundsException ex) {
           System.out.println(ex.getMessage());
       }
        System.out.print("[");
        for (int i = s; i < e; i++) {
            System.out.print(l.get(i)+" ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        iterateFromSpecifiedPosition(l,1,6);
    }

}
