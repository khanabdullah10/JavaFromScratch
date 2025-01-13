package logicBuilding.beinner;

import java.util.Arrays;

public class SortTheArrayInAscendingOrder {

    static void ascending(int[] arr) {
        // Selection Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;  // Assume the current index is the smallest

            // Find the smallest element in the unsorted portion of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the element at index 'i'
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {

        int[] arr = {1,6,1,0,5,4,5,0,1};

        ascending(arr);

    }

}
