package logicBuilding.beinner;

public class PowerOfANumber {


   static int pow(int n, int e){
        int result = 1;


        for (int i =1 ; i <=e; i++) {

            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }
}
