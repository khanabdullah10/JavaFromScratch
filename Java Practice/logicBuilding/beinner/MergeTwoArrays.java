package logicBuilding.beinner;

import java.util.ArrayList;

public class MergeTwoArrays {

    static void merge(int[] ar, int[] arr){
        ArrayList<Integer> common = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            common.add(ar[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            common.add(arr[i]);
        }

        System.out.println(common);
    }


    public static void main(String[] args) {
        int[] ar= {9,0,8,2,7,7,6,3,4,2};
        int[] arr = {9,8,6,7,8,0,0,1,4,9};

        merge(ar,arr);
    }

}
