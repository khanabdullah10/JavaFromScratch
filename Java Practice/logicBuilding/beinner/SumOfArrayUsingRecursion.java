package logicBuilding.beinner;

public class SumOfArrayUsingRecursion {

    static int sum(int[] arr, int n) {
        // Base case: if the array is empty or we reach the end, return 0
        if (n <= 0) {
            return 0;
        }
        // Recursive case: return the last element + sum of the remaining array
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // Example array
        int n = arr.length;  // Length of the array
        System.out.println("Sum of the array: " + sum(arr, n));
    }
}
