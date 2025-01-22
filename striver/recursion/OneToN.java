package striver.recursion;

public class OneToN {


    static void rec(int i , int n){

        if(i>n) return;

        System.out.println(i);
        rec(i+1,n);
    }



    public static void main(String[] args) {

        rec(1,5);

    }
}
