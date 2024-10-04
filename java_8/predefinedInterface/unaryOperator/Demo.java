package src.java_8.predefinedInterface.unaryOperator;


import java.util.function.UnaryOperator;

/***
 * unary Operator - If input and output are of the same type
 * It is a Child Interface of Function<T,R>
 */
public class Demo {
    public static void main(String[] args) {
        UnaryOperator<Integer> u = i-> i*2;
        System.out.println(u.apply(10));
    }
}
