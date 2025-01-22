package striver.arrays;

public class CountFrequency {


    static void result(int[] arr, int n){
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                count++;
            }
        }
        System.out.println(n + " : "+ count);
    }




    public static void main(String[] args) {

        int[] arr = {6,5,4,1,6,1};
        result(arr,1);

    }
}
