package src.collectionFrameWork.arrayListExercise;


//16. Write a Java program to clone an array list to another array list.


import java.util.ArrayList;

public class Question_16 {

    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();

        System.out.println(newc1);

    }

}
