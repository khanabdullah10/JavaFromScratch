package logicBuilding.beinner;

public class CheckTheNumberIsDivisibleBy5 {

    static void isDivisible(int n){
        if(n % 5 ==0) System.out.println(n + " is divisible by 5 ");
        else System.out.println(n + " is not divisible by 5");
    }

    public static void main(String[] args) {
        isDivisible(20);
    }

}
