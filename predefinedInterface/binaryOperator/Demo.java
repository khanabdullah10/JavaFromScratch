package src.predefinedInterface.binaryOperator;


import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/***
 * Binary Operator - if both arguments and the return types are same,
 * It is a child interface of BiFunction<T,T,R>
 *
 */
public class Demo {
    public static void main(String[] args) {
        BinaryOperator<Integer> bo = (i1,i2)-> i1+i2;
        System.out.println(bo.apply(10,20));
    }
}

