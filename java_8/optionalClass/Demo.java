package src.java_8.optionalClass;

import java.util.Optional;

/*** Optional class in java is a container obj that may contain non-null value or may not
 *   It help in reduces null checks and help to avoid RE:NPE
 */



public class Demo {

//    Consumer<String> printer = System.out::println;

    public static void main(String[] args) {
        Optional<String> op = Optional.empty();
        System.out.println(op);
        op = Optional.of("Hello");
        System.out.println(op);
        op = Optional.ofNullable(null); // does not throw null
        System.out.println(op);

//        op = Optional.of(null);// throws exception if null is found
//        System.out.println(op);

/***

 * Common methods

 * isPresent() - returns true if value is present

 * ifPresent() - If the Optional instance is empty (i.e., it doesn't contain a value); the ifPresent method does nothing.
   If the Optional instance is not empty, the ifPresent method applies the provided Consumer to the value present in
   the Optional instance.

   get() - throws exception if the optional is empty RE:NoSuchElementFound

 */

//        isPresent()
        if(op.isPresent()){ // returns true if value is present
            System.out.println("value is present");
        }else{
            System.out.println("No value is present");
        }

//        ifPresent()
        Optional<String> optional = Optional.ofNullable("Hello");
        optional.ifPresent(value -> System.out.println("Value: " + value));

//        get()
        Optional<String> opl = Optional.ofNullable(null);
//        String val = opl.get(); // throws exception if the optional is empty
//        System.out.println(val);

 //      orElseGet()
        Optional<String> ops = Optional.ofNullable("Koi kahe kehta rahe kitna bhi humko deewana");
        String value = ops.orElseGet(()-> "Default");// returns the value if present, otherwise invokes a supplier that provides a value
        System.out.println(value);

//         orElseThrow()
        Optional<String> opst = Optional.ofNullable(null);
//        String vall = opst.orElseThrow(()-> new IllegalArgumentException("It is empty"));
//        System.out.println(vall);

//        map()
        Optional<String> opp = Optional.ofNullable("Hello");
        Optional<Integer> len = opp.map(String::length);
        System.out.println(len);

//        flatMap()
        Optional<String> oppt = Optional.ofNullable("Hello");
        Optional<Integer> lent = oppt.flatMap(valuee -> Optional.of(valuee.length()));
        System.out.println(lent);


    }
}
