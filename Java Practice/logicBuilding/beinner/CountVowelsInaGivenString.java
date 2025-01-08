package logicBuilding.beinner;

public class CountVowelsInaGivenString {


    static int count(String s){
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u'){
                count ++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String s = "KHAN";
        System.out.println("vowels in the given String s: "+ s+" are " +count(s));
    }
}
