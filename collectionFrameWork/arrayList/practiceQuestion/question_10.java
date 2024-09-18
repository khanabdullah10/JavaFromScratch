package src.collectionFrameWork.arrayList.practiceQuestion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//10. Write a Java program to shuffle elements in an array list.
public class question_10 {


    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(475);
        lst.add(75);
        lst.add(47);
        lst.add(40);
        lst.add(70);

        System.out.println("\n"+lst);

        Collections.shuffle(lst);
        System.out.println(lst);
    }

}
