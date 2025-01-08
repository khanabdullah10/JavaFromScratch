package logicBuilding.beinner;

public class Concatenation {


    static void concat(String a , String b){

        System.out.println(a+" "+b);
    }

    static void con(String s){
        String n = "Hello ";
        n = n.concat(s);
        System.out.println(n);
    }


    public static void main(String[] args) {

        concat("Hello","Java");
        con("Anubhav");
    }
}
