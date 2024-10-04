package src.java_8.predefinedInterface.biConsumer;

import java.util.function.BiConsumer;

public class Demo {
    public static void main(String[] args) {
        BiConsumer<String,String> con = (s1,s2) -> System.out.println(s1+s2);

        con.accept("khan ","Abdullah");
    }
}
