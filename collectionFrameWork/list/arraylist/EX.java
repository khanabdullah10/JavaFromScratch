package collectionFrameWork.list.arraylist;
// Iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EX {

    public static void main(String[] args) {
        List l = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            l.add(i);
        }

        Iterator itr = l.iterator();

        while(itr.hasNext()){
            Integer I = (Integer)itr.next();
            if(I % 2 == 0){
            System.out.print(I + " ");

            }else {
                itr.remove();
            }

        }
        System.out.println();
        System.out.println(l);



    }

}
