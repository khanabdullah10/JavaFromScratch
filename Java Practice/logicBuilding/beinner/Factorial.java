package logicBuilding.beinner;

public class Factorial {
    static int fact(int n) {
        int sum = 1;
        for (int i = sum; i <= n; i++) {
            sum *= i;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
