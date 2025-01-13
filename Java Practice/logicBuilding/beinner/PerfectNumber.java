package logicBuilding.beinner;

public class PerfectNumber {



    static boolean isPerfect(int n){
        if(n<=1){
            return false;
        }

        int sum = 1;

        for (int i = 2; i < n; i++) {
            if(n%i==0) sum+=i;
        }
        return sum == n;
    }






    public static void main(String[] args) {

        boolean perfect = isPerfect(6);
        System.out.println(perfect);

    }
}
