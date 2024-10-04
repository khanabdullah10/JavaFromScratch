package src.java_8.predefinedInterface.functionInterface;

import java.util.function.Function;

public class Demo {
    /***
     * Function Interface - Takes one argument, performs operation and return result that can be of any type
     */
    public static void main(String[] args) {
        Function<String,Integer> f = s -> s.length();
        System.out.println(f.apply("khan"));

        Function<Integer,Integer> f1 = i-> i*2;
        Function<Integer,Integer> f2 = i-> i*i*i;

        //Functional chaining
        System.out.println(f.andThen(f1).apply("khan"));
//        f followed by f1

        System.out.println(f1.compose(f2).apply(2));
//        f2 followed by f1
    }
}
