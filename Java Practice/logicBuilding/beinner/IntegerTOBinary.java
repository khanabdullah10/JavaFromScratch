package logicBuilding.beinner;

public class IntegerTOBinary {

    static String convert(int n){

        String s = Integer.toBinaryString(n);

        return s;
    }


    static StringBuilder convert1(int n){

        if(n == 0){
            return new StringBuilder("0");
        }

        StringBuilder sb = new StringBuilder();
        while (n>0){

            int rem = n % 2;
            sb.insert(0,rem);
            n = n /2;

        }
        return sb;
    }

    public static void main(String[] args) {

        System.out.println(convert(10));
        System.out.println(convert1(10));


    }


}
