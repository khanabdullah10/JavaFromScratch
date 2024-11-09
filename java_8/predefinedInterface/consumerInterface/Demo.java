    package src.java_8.predefinedInterface.consumerInterface;

import java.util.function.Consumer;

/***
 * Consumer Interface - Accept some input and perform required operation and not required to return anything(return void)
 */
public class Demo {
    public static void main(String[] args) {
        Consumer<String> c = s-> System.out.println("Hello, "+s);
        c.accept("Khan Abdullah");

        Consumer<String> c1 = (s)-> System.out.println("how are you? ");

//        Consumer Chaining
        c.andThen(c1).accept("khan Abdullah");

    }
}
