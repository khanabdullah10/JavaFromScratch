package logicBuilding.beinner;

public class Palindrome {

    static boolean isPalindrome(String s){

       s = s.toLowerCase();
//       StringBuilder sb = new StringBuilder(s);

       String rev = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            rev += s.charAt(i);
        }


//       if (s.equals( sb.reverse().toString())){
//           return true;
//       }


        if(s.equals(rev)) return true;
        else return false;

    }


    static boolean isPalindromeNumber(int n){

        int og = n;
            int rev = 0;
            while (n!=0){
                int lastDigit = n % 10 ;
                rev = rev * 10 + lastDigit;
                n = n /10;
            }

            if(og == rev) return true;
            else return false;


    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindromeNumber(121));
    }


}
