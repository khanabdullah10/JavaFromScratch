package logicBuilding.beinner;

import java.util.Random;

public class Again {

    public static int check(int n){

        int largest = 0;
        int digit = 0;

        while (n>0){
            digit = n % 10;
            if(digit > largest) largest = digit;
            n = n / 10;
        }

        return largest;

    }


    static int checkSmallest(int n){
        int smallest = Integer.MAX_VALUE;
        int digit = 0;
        while(n>0){
            digit = n % 10;
            if(digit < smallest) smallest = digit;
            n = n/10;
        }
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println(check(56464));
        System.out.println(checkSmallest(56464));

    }
}
