package logicBuilding.beinner;

public class StringCases {


    static void toUppercase(String s){

        String ns = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='a'&& ch<='z'){
                ch = (char) (ch-32);
            }
            ns+=ch;
        }

        System.out.println(ns);
    }

    static void toLowercase(String s){

        String ns = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='A'&& ch<='Z'){
                ch = (char) (ch+32);
            }
            ns+=ch;
        }

        System.out.println(ns);
    }



    public static void main(String[] args) {
//
//        String s = "KhaN";
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        char ns = 'A';
//        char c = (char) (ns+32);
//        System.out.println(c);

        toUppercase("khan");
        toLowercase("KHAN");

    }
}
