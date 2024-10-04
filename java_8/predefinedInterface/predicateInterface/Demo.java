package src.java_8.predefinedInterface.predicateInterface;


import java.util.function.Predicate;

/***
 * Predicate Interface - Takes one argument for some conditional check and returns boolean value
 */
public class Demo {

    public static void main(String[] args) {
        Predicate<Integer> p = i-> i%2==0;
        System.out.println(p.test(2));

        Predicate<Integer> p1 = i -> i>10;

    //predicate joining
        System.out.println(p.and(p1).test(12));
        System.out.println(p.or(p1).test(8));
        System.out.println(p1.negate().test(8));
    }
}

