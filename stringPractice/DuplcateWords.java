package src.stringPractice;

public class DuplcateWords {

    static void chechDuplcateWords(String s) {
        String[] ch = s.split(" ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + ", ");
        }

    }
    public static void main(String[] args) {
        String s = "Khan Abdullah Ubaid Ahmed";
        chechDuplcateWords(s);
    }
}
