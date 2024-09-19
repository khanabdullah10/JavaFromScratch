package src.collectionFrameWork.arrayListExercise;


//8. Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_8 {

//    static void sortArray(List<Integer> lst){
//        Integer temp = 0;
//        for (int i = 0; i < lst.size(); i++) {
//            for (int j = 0; j < lst.size(); j++) {
//                if (lst.get(i)>lst.get(j)){
//                    temp = lst.get(i);
//                    lst.get(i) = lst.get(j);
//                    lst.get(j) = temp;
//
//                }
//            }
//        }
//
//    }


    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
       lst.add(475);
       lst.add(75);
       lst.add(47);
       lst.add(40);
       lst.add(70);

       System.out.println("\n"+lst);

       Collections.sort(lst);
        System.out.println(lst);

//        System.out.println();



    }
}
