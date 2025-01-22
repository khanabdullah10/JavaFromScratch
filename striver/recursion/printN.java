package striver.recursion;

public class printN {



    static void recursive(int i,int n){

        if(i==n) return;

        System.out.println("khan");
        recursive(i+1,n);
    }

    public static void main(String[] args) {

        recursive(0,5);
    }
}
