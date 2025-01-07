package Introduction;

import java.util.ArrayList;

//Write a program to remove null from List.
//        Input: [1, null, 2, 3, null, 4]
//        Output: [1, 2, 3, 4]
public class TestQuestion_8 {

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(null);
        lst.add(2);
        lst.add(3);
        lst.add(null);
        lst.add(4);

        System.out.println("\n List :");
        System.out.println(lst);

        System.out.println("\n Updated list :");
       lst.removeIf(element -> element ==null);

        System.out.println(lst);

    }



}
