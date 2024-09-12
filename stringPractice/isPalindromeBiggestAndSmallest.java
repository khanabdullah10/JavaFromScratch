package src.stringPractice;

public class isPalindromeBiggestAndSmallest {


    static boolean isPalindrome(String s){
        s = s.toLowerCase();
        boolean flag = false;

        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) == s.charAt(s.length()-i-1)) flag = true;
            else flag =  false;
        }
        return  flag;

    }

    public static void main(String[] args) {
        String string = "Wow you own kayak";
        String word = "", smallPalin = "", bigPalin="";

        String[] words = new String[100];
        int temp = 0, count = 0;

        string = string.toLowerCase();

        for(int i = 0; i < string.length(); i++){

            if(string.charAt(i) != ' '){
                word = word + string.charAt(i);
            }
            else{

                words[temp] = word;

                temp++;

                word = "";
            }
        }


        for(int i = 0; i< temp; i++){
            if(isPalindrome(words[i])){

                count++;

                if(count == 1)

                    smallPalin = bigPalin = words[i];


                else{

                    if(smallPalin.length() > words[i].length())
                        smallPalin = words[i];


                    if(bigPalin.length() < words[i].length())
                        bigPalin = words[i];
                }
            }
        }

        if(count == 0)
            System.out.println("No palindrome is present in the given string");
        else{
            System.out.println("Smallest palindromic word: " + smallPalin);
            System.out.println("Biggest palindromic word: " + bigPalin);
        }
    }
}

