package logicBuilding.beinner;

public class CheckPositiveOrNegative {

    static public void checkNumber(int n){
        if(n > 0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        }
        else System.out.println("The given num is zero");
    }


    public static void main(String[] args) {
        checkNumber(-3);
    }


}
