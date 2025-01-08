package logicBuilding.beinner;

public class CountOcurrencesOfA_String {

    static int count(String s,char c){
        int count = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== c) {
                count++;
            }

        }
        return count;
    }


    public static void main(String[] args) {

//        System.out.println(count("khanAbdullah",'a'));
        String s1 = "Hello";
        String s2 = "Hel" + "lo";
        System.out.println(s1 == s2);

    }
}
