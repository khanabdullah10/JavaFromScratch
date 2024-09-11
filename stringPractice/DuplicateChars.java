package src.stringPractice;

public class DuplicateChars {

    static char findDuplicate(String s){
        char[] ch = s.toCharArray();
        char duplicate = ch[0];
        s = s.toLowerCase();
        boolean flag = true;
        for (int i = 1; i < ch.length; i ++){
            if(ch[i]==ch[i-1]) duplicate = ch[i];
            else flag = false;i++;
        }
        return duplicate;
    }

    public static void main(String[] args) {
        String s = "Khank";
        System.out.println(findDuplicate(s));
    }
}
