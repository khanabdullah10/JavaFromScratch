package classesAndObjects;
 abstract class Shape {


     abstract double area();
     abstract double perimeter();

}class Rectangle extends Shape{

    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }

 }class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }

} class Triangle extends Shape{

     private double side_a;
     private double side_b;
     private double side_c;


    public Triangle(double side_a, double side_b, double side_c) {
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public double area(){
        double s=  (side_a + side_b + side_c)/2;
        return Math.sqrt(s*(s-side_a)*((s-side_b)*(s-side_c)));
     }

     public double perimeter(){
        return side_a + side_b + side_c;
     }
}
public class Main {

    public static void main(String[] args) {
        System.out.println();
        Rectangle rec = new Rectangle(5.7,2.5);
        System.out.println("Area of Rectangle : "+rec.area());
        System.out.println("Perimeter of Rectangle : "+rec.perimeter());
        System.out.println();
        Circle circle =  new Circle();
        circle.setRadius(3.8);
        System.out.println("Area of Circle : "+circle.area());
        System.out.println("Perimeter of Circle : "+circle.perimeter());
        System.out.println();
        Triangle traingle = new Triangle(5.3,4.2,9.5);
        System.out.println("Area of Triangle : "+traingle.area());
        System.out.println("Perimeter of Triangle : "+traingle.perimeter());


    }


}

