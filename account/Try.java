package account;
//class Example{
//    {
//        System.out.println("Inside instance initializer block of Super class");
//    }
//
//    public Example() {
//        System.out.println("Inisde super class constructor");
//    }
//
//    void display(){
//        System.out.println("display super class method");
//    }
//}
// class Tester extends Example{
//    int a = 10;
//    static int b = 20;
//    {
//        System.out.println("Inside instance initializer block of Sub class");
//    }
//
//    Tester(){
////        super();
//        System.out.println("Inside sub class constructor");
//    }
//    {
//        System.out.println("Instance sequence 2");
//    }
//    static {
////        Tester tester = new Tester();
////        System.out.println(tester.a);
////        System.out.println(b);
////        System.out.println(b);
//        System.out.println("Inside the static  block");
//    }
//
//
//    void display() {
//        System.out.println("Subclass display method");
//    }
//
//
//}

class World{
    String name = "khan";
    void print(){
        System.out.println("Hello World "+ name);
    }
}

public class Try{
    public static void main(String[] arguments) {
//        System.out.println("Main");
//        Tester test = (Tester) new Example();
        System.out.println(new World().name);
        new World().print();


    }
}

//"Inside the static  block"
//Main
//"Inside instance initializer block of Super class"
//"Inisde super class constructor"
//Inside instance initializer block of Sub class"
//Instance sequence 2
//Inside sub class constructor

//"Inside the static  block"
//Main
//"Inside instance initializer block of Super class"
//"Inisde super class constructor"






