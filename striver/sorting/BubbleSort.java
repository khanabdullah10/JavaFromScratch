package striver.sorting;

import java.util.Arrays;

public class BubbleSort {



    static void bubble_sort(int[] arr){

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }









    public static void main(String[] args) {

        int[] arr = {6,5,4,7,1,4,9,11,3,4};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
