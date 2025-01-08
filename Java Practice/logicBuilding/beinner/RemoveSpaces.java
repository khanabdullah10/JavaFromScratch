package logicBuilding.beinner;

public class RemoveSpaces {


    static void remove(String s){
        String ns = "";
        ns += s.replaceAll(" ","");
        System.out.println(ns);
    }


    public static void main(String[] args) {
        remove("khan Abdullah");
    }
}
