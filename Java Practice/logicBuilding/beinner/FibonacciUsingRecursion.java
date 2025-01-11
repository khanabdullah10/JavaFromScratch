package logicBuilding.beinner;

public class FibonacciUsingRecursion {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
