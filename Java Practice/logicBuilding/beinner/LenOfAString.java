package logicBuilding.beinner;

public class LenOfAString {

    static void count(String s){

        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            count++;
//        }
        

            for (int i = 0; ; i++) {
                try {
                    s.charAt(i);
                    count++;
                }catch (StringIndexOutOfBoundsException e){
                    break;
                }
            }

        System.out.println("length is "+ count);
    }

    public static void main(String[] args) {
        count("khan");
    }
}
