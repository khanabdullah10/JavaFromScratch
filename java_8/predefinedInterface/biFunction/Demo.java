package src.java_8.predefinedInterface.biFunction;

import java.util.function.BiFunction;

public class Demo {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> bi = (a,b) -> a+b;
        System.out.println(bi.apply(10,20));
    }

}
