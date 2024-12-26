package logicBuilding.beinner;

public class FibonacciSeries {

    static void printFib(int n){
        int first = 0, second =1;
        int count = 2;



//        for (int i = 0; i <= n; i++) {
//            int next = first + second;
//            System.out.println(next + " ");
//            first = second;
//            second = next;
//        }
        System.out.print(first + " " + second + " ");
        while (count < n){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            count ++;
        }

    }


    public static void main(String[] args) {
        printFib(20);
    }

}
