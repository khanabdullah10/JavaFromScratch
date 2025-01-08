package logicBuilding.beinner;

import java.util.ArrayList;

public class CommonElementsBtwArrays {

    static void findCommon(int[] ar, int[] arr){
        ArrayList<Integer> common = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (ar[i]==arr[j]){
                    if(!common.contains(arr[i])){
                        common.add(arr[i]);
                    }
                }
            }
        }

        System.out.println(common);
    }



    public static void main(String[] args) {

        int[] ar= {9,0,8,2,7,7,6,3,4,2};
        int[] arr = {9,8,6,7,8,0,0,1,4,9};

        findCommon(ar,arr);



    }
}
