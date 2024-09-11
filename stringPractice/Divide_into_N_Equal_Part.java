package src.stringPractice;

public class Divide_into_N_Equal_Part {

    static void equalPart(String s , int n){

        s = s.toLowerCase();

        int partSize = s.length()/n;

        if(s.length() % n != 0) System.out.println("Invalid String");
        else{
            System.out.print("Equal part of String :");
            for (int i = 0; i < s.length(); i++) {
                if(i % partSize == 0)
                    System.out.println();
                    System.out.print(s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        System.out.println("Given String is : "+"\""+str+"\"");
        equalPart(str,3);
    }
}
