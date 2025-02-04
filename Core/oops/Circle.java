package oops;

public class Circle {
    double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculateArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public static void main(String[] args) {

        Circle circle = new Circle(2.5);
        System.out.println(circle.calculateArea());

    }

}
