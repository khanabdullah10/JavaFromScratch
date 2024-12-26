package logicBuilding.beinner;

public class SmallestOFThree {

    public static void check(int a , int b , int c){
        if(a<b && a<c) System.out.println(a+" is the smallest ");
        else if(c<a && c<b) System.out.println(c +" is the smallest ");
        else System.out.println(b + " is the smallest");
    }

    public static int check1(int n){
        int digit = 0;
        int smallest = 10;
        while(n>0){
            digit = n%10;
            if(digit < smallest) smallest = digit;
            n= n/10;
        }
        return smallest;
    }


    public static void main(String[] args) {
//        check(90,50,100);
        System.out.println(check1(6913));
    }
}
