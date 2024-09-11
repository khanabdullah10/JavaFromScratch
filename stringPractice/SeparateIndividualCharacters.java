package src.stringPractice;

public class SeparateIndividualCharacters {

    static void separateCharacters(String s){

        s = s.toLowerCase();
        char[]  ch = s.toCharArray();

        for (int i = 0;i < ch.length; i++) System.out.print(ch[i]+",");

    }

    public static void main(String[] args) {
        String s = "khanAbdullah";
        System.out.print("[ ");
        separateCharacters(s);
        System.out.print(" ]");
    }
}
