package logicBuilding.beinner;

public class SumOfA_Number {

    public static int sum(int n){
        int sum = 0;
        sum = (n*(n+1))/2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(100));

    }

}
