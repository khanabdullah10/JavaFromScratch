package src.collectionFrameWork.arrayListExercise;

import java.util.ArrayList;
import java.util.List;

// 12. Write a Java program to extract a portion of an array list.
public class Question_12 {


    static void ExtractPortion(List l,int start, int end){
        System.out.print("[");
        for (int i = start; i < end; i++) {
            System.out.print(l.get(i) +" ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        List lst = new ArrayList<>();

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        System.out.println("Initial List:");
        System.out.println(lst);

        System.out.println("Extracting portion of List from index 2 up till the length-1 by using user define method:");
        ExtractPortion(lst,2,lst.size());
        System.out.println("\nExtracting portion of List from index 3 up till the length-1 by using built-in define method:");
        lst = lst.subList(3, lst.size());
        System.out.println(lst);
    }




}
