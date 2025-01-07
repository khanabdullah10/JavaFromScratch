package Introduction;

public class Try {
    static String s = "Hello";
}
class And extends Try{
    public static void main(String[] args) {
       Try.s = "World";
        System.out.println(s);
    }
}
