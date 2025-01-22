package striver.recursion;

import java.util.Arrays;

public class RevereAnArray {



    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int[] reverseAnArray(int[] arr, int start, int end){

        if(start<end){
            swap(arr,start,end);
            reverseAnArray(arr ,start+1,end-1);

        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("Before : ");
        int[] arr = {5,4,3,2,1};
        for (int i : arr){
            System.out.print(i+" ");
        }

        System.out.println();

        reverseAnArray(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
