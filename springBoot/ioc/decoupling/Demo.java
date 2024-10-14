package src.springBoot.ioc.decoupling;

/**
 * Decoupling
 */


 class Car {

    private Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    public void drive() {
        driver.drive(this);
    }
}

 abstract class Driver {
    public abstract void drive(Car car);
}

 class JohnDriver extends Driver {
    public void drive(Car car) {
        System.out.println("John is driving the car!");
    }
}

 class JaneDriver extends Driver {
    public void drive(Car car) {
        System.out.println("Jane is driving the car!");
    }
}

public class Demo {

    public static void main(String[] args) {
        Car car = new Car(new JaneDriver());
        car.drive();
    }


}
