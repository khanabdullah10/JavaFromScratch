package src.collectionFrameWork.arrayListExercise;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.List;

public class Question_4 {


    static void getValueFromIndex(List<Object> lst , int n){
//        int count = 0;
        for (int i = 0; i < lst.size(); i++) {
            if(i == n){
                System.out.println(lst.get(i));
                break;
            }
        }
    }





    static void getIndexValue(List<Object> lst,Object o){
//        int count = 0;
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).equals(o)){
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {

        List<Object> lst = new ArrayList<>();

        lst.add(25);
        lst.add("Khan");
        lst.add("Abdullah");
        lst.add("Mumbai");
        lst.add("400-102");


        getIndexValue(lst,"Khan");
        getValueFromIndex(lst,1);

//        System.out.println(lst.get(1));
//        System.out.println(lst.indexOf("Khan"));

    }
}
