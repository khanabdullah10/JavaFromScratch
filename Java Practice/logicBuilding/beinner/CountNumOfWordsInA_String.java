package logicBuilding.beinner;

public class CountNumOfWordsInA_String {

    static int count(String s){

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        return count;
    }


    public static void main(String[] args) {

        String str = "KhanAbdullah";
        System.out.println("Number of words in "+str+ " : "+ count(str));
    }
}
