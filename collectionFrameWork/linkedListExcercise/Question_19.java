package src.collectionFrameWork.linkedListExcercise;

//19. Write a Java program to remove and return the first element of a linked list.


import java.util.LinkedList;

public class Question_19 {

    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        System.out.println("Original linked  list: " + l);

        System.out.println("Removed element: "+ l.pop());

        System.out.println("Linked list after pop operation: "+l);

    }

}
