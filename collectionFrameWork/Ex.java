package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex {


    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);

        List l1 = Collections.synchronizedList(l);
        System.out.println(l1);

    }

}
