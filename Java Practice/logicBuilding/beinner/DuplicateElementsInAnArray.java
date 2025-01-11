package logicBuilding.beinner;

import java.util.Arrays;

public class DuplicateElementsInAnArray {


    static int[] duplicates(int[] arr){

        int[] duplicates = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){

                    boolean alreadyAdded = false;
                    for (int k = 0; k < index; k++) {
                        if(duplicates[k]==arr[i]) alreadyAdded = true; break;
                    }

                    if(!alreadyAdded) duplicates[index++] = arr[i];
                    break;
                }
            }
        }


        return Arrays.copyOfRange(duplicates, 0, index);

    }





    public static void main(String[] args) {

        int[] arr = {4,3,1,5,4,2,3};
        System.out.println(Arrays.toString(duplicates(arr)));


    }
}
