package logicBuilding;

public class CountDigit {

    public static int countDigit(int n ){
        int count = 0;

        while(n>0){
            count ++;
            n = n/10;
        }
        return  count;
    }


    public static void main(String[] args) {
        int i = countDigit(3856256);
        System.out.println(i);
    }

}
