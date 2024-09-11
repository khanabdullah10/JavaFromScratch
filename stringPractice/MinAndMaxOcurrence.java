package src.stringPractice;

public class MinAndMaxOcurrence {

    static char maxOccurringChar(String str) {
        char ans = str.charAt(0);
        int i, curr_freq = 0, max_freq = 0, n = str.length();
        for (i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                curr_freq++;
            }
            else {
                if (max_freq < curr_freq) {
                    max_freq = curr_freq;
                    ans = str.charAt(i - 1);
                }
                curr_freq = 0;
            }
        }
        if (max_freq < curr_freq) {
            max_freq = curr_freq;
            ans = str.charAt(i - 1);
        }
        return ans;
    }





    static char minOccurringChar(String str) {
        char ans = str.charAt(0);
        int i, curr_freq = 0, min_freq = 0, n = str.length();
        for (i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                curr_freq++;
            }
            else {
                if (min_freq > curr_freq) {
                    min_freq = curr_freq;
                    ans = str.charAt(i - 1);
                }
                curr_freq = 0;
            }
        }
        if (min_freq > curr_freq) {
            min_freq = curr_freq;
            ans = str.charAt(i - 1);
        }
        return ans;
    }

    public static void main(String[] args) {

        String s = "apple";
        System.out.println("Maximum occurence of chracter is : "+maxOccurringChar(s));
        System.out.println("Minimum occurence of chracter is : "+minOccurringChar(s));
    }
}
