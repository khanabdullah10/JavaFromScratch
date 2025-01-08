package logicBuilding.beinner;

public class AverageOfAnArray {


    public static void main(String[] args) {

        int[] arr = {98,4,642,445,2,412,1};

        double avg = 0.0d;
        double sum = 0.0d;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }


        avg = (sum) / (arr.length);

        System.out.println(avg);

    }
}
