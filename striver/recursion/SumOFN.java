package striver.recursion;

public class SumOFN {



    static int rec(int n){

        if(n==1) return 1;
        else return n+rec(n-1);
    }

    public static void main(String[] args) {
        System.out.println(rec(5));
    }
}
