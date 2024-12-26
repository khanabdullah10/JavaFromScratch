package logicBuilding.beinner;

public class ReverseNumber {

    static int rev(int n){
        int rev = 0;
        while (n!=0){
            int lastDigit = n % 10 ;
            rev = rev * 10 + lastDigit;
            n = n /10;
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(rev(345646));
    }

}
