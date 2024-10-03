package src.predefinedInterface.biPredicate;


import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> p = (x,y)-> x>y;
        System.out.println(p.test(10,20));
    }

}
