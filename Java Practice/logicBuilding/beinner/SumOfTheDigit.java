package logicBuilding.beinner;

public class SumOfTheDigit {

    static int sum(int n){
        int sum = 0, lastDigit = 0;
        while(n!=0){
            lastDigit = n % 10;
            sum+= lastDigit;
            n = n /10;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sum(123));
    }
}
