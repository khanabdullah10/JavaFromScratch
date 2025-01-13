package logicBuilding.beinner;

class Parent {
    public void display(int num) {
        System.out.println("Parent: " + num);
    }

    public void display(String str) {
        System.out.println("Parent: " + str);
    }
}

class Child extends Parent {
    @Override
    public void display(int num) {
        System.out.println("Child: " + num);
    }

    public void display(String str, int num) {
        System.out.println("Child: " + str + " and " + num);
    }
    public void display(String str) {
        System.out.println("Child: " + str);
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display(10);                // Line 1
        obj.display("Hello");           // Line 2
//        obj.display("Hello", 10);
//        Child obj1 = new Child();//// Line 3
//
//        obj1.display(10);
//        obj1.

    }
}

