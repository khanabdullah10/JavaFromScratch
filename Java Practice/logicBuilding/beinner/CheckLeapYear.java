package logicBuilding.beinner;

public class CheckLeapYear {

    public static void check(int n){
        if((n % 4==0 && n % 100 !=0)|| n % 400 == 0) System.out.println(n + " is leap year !");
        else System.out.println("not a leap year !");
    }

    public static void main(String[] args) {
        check(2023);
    }

}
