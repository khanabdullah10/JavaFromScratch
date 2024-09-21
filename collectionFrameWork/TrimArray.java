package src.collectionFrameWork;

import java.lang.reflect.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

public class TrimArray {

    public static int getDefaultCapacity(ArrayList<?> arrayList) throws Exception {
        if (arrayList == null) {
            return 0;
        }
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(arrayList)).length;
    }
    public static void main(String[] args) throws Exception {
        ArrayList<String> java = new ArrayList<>();
        java.add("raam");
        java.add("Shiyam");
        java.add("Rahul");
        java.add("Ankit");
        int defaultCapacity = TrimArray.getDefaultCapacity(java);
        System.out.println(defaultCapacity);

        System.out.println("Original array- \n"+java);
        java.trimToSize();
        int defaultCapacityAfterTrimming = TrimArray.getDefaultCapacity(java);
        System.out.println(defaultCapacityAfterTrimming);
        System.out.println(java);


    }
}

