package logicBuilding.beinner;

public class SumOFAllTheElementInAnArray {

    static int sum (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(arr));


    }
}
