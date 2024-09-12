package src.stringPractice;

public class StringSwapping {

    public static void main(String[] args) {
        String s1 = " Khan";
        String s2 = " Abdullah";

        System.out.println("Initial String  before swapping  s1 : "+ s1);
        System.out.println("Initial String  before swapping  s2 : " + s2);
        s1 = s1 + s2;
        s2 = s1.replaceAll(s2,"");
        s1 = s1.replaceAll(s2,"");

        System.out.println("After Swapping String s1 becomes s1 : " + s1);
        System.out.println("After Swapping String s2 becomes s2 :  " + s2);

    }
}
