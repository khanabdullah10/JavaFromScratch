package logicBuilding.beinner;

public class CheckForOddOrEven {

    public static void checkNumber(int n){
        if(n%2==0) System.out.println(n + " is positive");
        else System.out.println(n + " is Odd");
    }


    public static void main(String[] args) {
        checkNumber(5);
    }
}
