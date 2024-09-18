package src.collectionFrameWork.arrayList.practiceQuestion;


//3. Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.List;

public class Question_3 {

    public static void main(String[] args) {
        List<Object> lst = new ArrayList<>();

        lst.add(25);
        lst.add("Khan");
        lst.add("Abdullah");
        lst.add("Mumbai");
        lst.add("400-102");
        System.out.println("Initial List :");
        System.out.println(lst);
        System.out.println();
        System.out.println("Inserting \"908277634\" at the First position of ArrayList !");
        System.out.println();
        System.out.println("New List :");

        lst.add(0,908277634);
        System.out.println(lst);



    }


}
