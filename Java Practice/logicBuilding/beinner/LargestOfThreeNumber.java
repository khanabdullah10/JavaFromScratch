package logicBuilding.beinner;

public class LargestOfThreeNumber {

    public static void check(int a , int b , int c){
        if(a>b && a>c) System.out.println(a+" is the largest ");
        else if(c>a && c>b) System.out.println(c +" is the largest ");
        else System.out.println(b + " is the largest");
    }


    public static int check1(int n){
       int digit = 0;
       int largest = 0;
        while(n>0){
            digit = n%10;
            if(digit > largest) largest = digit;
            n= n/10;
        }
        return largest;
    }


    public static void main(String[] args) {
//        check(90,50,100);
        int i = check1(132);
        System.out.println(i);
    }

}
