package logicBuilding.beinner;

public class IsArmstrong {

    static boolean isArmstrong(int n){
        int og =n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum+= rem*rem*rem;
            n = n / 10;
        }

        if (sum == og) return true;
        else return false;

    }


    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
    }
}
