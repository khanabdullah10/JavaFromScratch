package src.java_8.predefinedInterface.supplierInterface;

import java.util.function.Supplier;

/***
 * Supplier Interface - Just supply the required objects, and it won't take any input
 */

public class Demo {
    public static void main(String[] args) {
        Supplier<String> s =()-> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp += (int) (Math.random() * 10);
            }
            return otp;
        };

        System.out.println(s.get());
    }
}
