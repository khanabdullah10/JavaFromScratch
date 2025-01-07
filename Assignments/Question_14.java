package Assignments;

public class Question_14 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 20; i++) {
            if(i%2!=0) arr[i/2] = i;
        }

        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
