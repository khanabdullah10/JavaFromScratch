package Introduction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableAndComparator {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(12);
        marks.add(85);  // Example of adding more elements
        marks.add(70);

        // You can now perform operations on the list
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);


    }
}
