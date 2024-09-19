package src.collectionFrameWork.arrayListExercise;

//21. Write a Java program to print all the elements of an ArrayList using the elements' position.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question_21 {

    public static void main(String[] args) {

        List l = new ArrayList<>();
        l.add(1);
        l.add(10);
        l.add(100);
        l.add(1000);
        l.add(10000);
        l.add(100000);

        System.out.print("[");
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+" ");
        }
        System.out.println("]");


        Iterator itr = l.iterator();

        while(itr.hasNext()){
            Integer i = (Integer) itr.next();
            System.out.print(i+ ",");
        }


    }
}