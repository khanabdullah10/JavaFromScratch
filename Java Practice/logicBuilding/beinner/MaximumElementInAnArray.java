package logicBuilding.beinner;

public class MaximumElementInAnArray {


    public static void main(String[] args) {

        int[] arr = {4,8,9,4,3,5,4,6};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]> max) max = arr[i];
        }
        System.out.println("Max : "+ max);
    }
}
