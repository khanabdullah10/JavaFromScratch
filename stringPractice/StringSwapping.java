package src.stringPractice;

public class StringSwapping {

    public static void main(String[] args) {
        String s1 = " Khan";
        String s2 = " Abdullah";

        System.out.println("Initial String  : "+ s1 + s2);

        s1 = s1.replaceAll(s1,s2);
        s2 = s2.replaceAll(s2,s1);

        System.out.println("After replacing Strings becomes : "+s1 + s2);

    }
}
