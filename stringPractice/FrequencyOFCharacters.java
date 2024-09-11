package src.stringPractice;

public class FrequencyOFCharacters {

    static int checkFrequency(String s , char c){
        int frquency = 0;
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int i = 0;
        for (i = 0; i < ch.length; i++) {
            if (c==ch[i]) frquency++;
        }
        return frquency;
    }

    public static void main(String[] args) {
        String s = "khanabdullah";
        int occurnce = checkFrequency(s,'a');
        System.out.println("Character \'a\' is duplicated "+ occurnce +" times in a String : "+s);
    }
}
