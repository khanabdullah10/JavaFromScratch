package src.stringPractice;

import java.util.ArrayList;

public class LargestAndSmallestWord {

    static void largestAndSmallest(String s){

        String[] words = new String[100];

        String word = "";
        String large = "";
        String small = "";
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                word += s.charAt(i);
            }
            else {
                words[length] = word;
                length++;
                word = "";
            }
        }

        small = large = words[0];

        for(int k = 0; k < length; k++){


            if(small.length() > words[k].length())
                small = words[k];


            if(large.length() < words[k].length())
                large = words[k];
        }
        System.out.println("Smallest word: " + small);
        System.out.println("Largest word: " + large);
    }


    public static void main(String[] args) {
        String s = "Hardships often prepare ordinary people for an extraordinary destiny";
        largestAndSmallest(s);
    }
}


