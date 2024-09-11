package src.stringPractice;

public class RotationString {


    static boolean checkRotation(String s1 , String s2){

        if(s1.length()!=s2.length()) return false;
        else{
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            String s3 = s1 + s1;
            if(s3.contains(s2)) return true;
            else return false;
        }
    }


    public static void main(String[] args) {

        String s  = "avajava";
        String s1 = "javaava";
        System.out.println("String 1 : "+s);
        System.out.println("String 2 : "+s1);

       if( checkRotation(s,s1)==true) System.out.println("The given string s1 is the rotation of string s2");
       else System.out.println("No string is not rotation of the other string  ");

    }
}
