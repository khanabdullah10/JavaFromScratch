package logicBuilding.beinner;

public class SimpleCalculator {


    public static void calc(int a , int b ,char c){
        int sum = 0;

        switch (c){
            case '+' :
                sum = a+b;
                System.out.println(sum);
                break;
            case '-' :
                sum = a-b;
                System.out.println(sum);
                break;
            case '*' :
                sum = a*b;
                System.out.println(sum);
                break;
            case '/' :
                sum = a/b;
                System.out.println(sum);
                break;
            default:
                System.out.println("only(+,-,*,/) operations are allowed");


        }

    }





    public static void main(String[] args) {
        calc(10,20,'/');
    }

}
