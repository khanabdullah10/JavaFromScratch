package logicBuilding.beinner;

public class MinimumElementInAnArray {

    public static void main(String[] args) {

        int[] arr = {4,8,9,4,3,5,4,6};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]< min) min = arr[i];
        }
        System.out.println("Min : "+ min);
    }
}
