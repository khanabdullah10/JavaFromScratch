package logicBuilding.beinner;

public class ReverseOfAString {

    public static void reverse(String s){
        String ns = "";

        for (int i = s.length()-1; i >= 0 ; i--) {
            ns+= s.charAt(i);
        }
        System.out.println(ns);

    }


    public static void main(String[] args) {
        reverse("khan");
        StringBuilder sb = new StringBuilder("khan");
        sb.reverse();
        System.out.println(sb);
    }



}
