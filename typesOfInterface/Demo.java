package src.typesOfInterface;





interface RegularInterface{
    /*** Contains only abstract method ***/
    void start();
    void stop();
}

interface FunctionalInterface{
    /*** Contains only one abstract method as well as multiple Static and default ***/

    void start();
    default void stop(){
        System.out.println("Stop from functional interface");
    }
    static void sleep(){
        System.out.println("Sleep from function interface");
    }
}

interface Marker{
    /*** Contains empty field ***/
}


public class Demo implements RegularInterface,FunctionalInterface,Marker{
    @Override
    public void start() {
        System.out.println("Hey start from Regular Interface");
    }

    @Override
    public void stop() {
        System.out.println("Hello stop from Regular Interface");
    }

    public static void main(String[] args) {
        FunctionalInterface fi = new FunctionalInterface() {
            @Override
            public void start() {
                System.out.println("Hello start from Functional Interface");
            }
        };
        System.out.println();
        fi.start();
        fi.stop();
        FunctionalInterface.sleep();

        RegularInterface ri = new Demo();
        ri.start();
        ri.stop();
    }

}
