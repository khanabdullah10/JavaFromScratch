package logicBuilding.beinner;

public class Swap {

    static void swap(int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a : "+a);
        System.out.println("b : "+b);

    }


    // without using the 3rd variable

    static void swap1(int a , int b){
        System.out.println("before swapping");
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping");
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

    }

    public static void main(String[] args) {
//        swap(30,20);
        swap1(30,20);
    }

}
