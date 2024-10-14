package src.springBoot.ioc.coupling;


/**
 *  Tightly coupled
 **/

 class Car {
    private JohnDriver driver = new JohnDriver();

    public void drive() {
        driver.drive();
    }
}

 class JohnDriver {
    public void drive() {
        System.out.println("John is driving the car!");
    }
}

public class Demo {

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
