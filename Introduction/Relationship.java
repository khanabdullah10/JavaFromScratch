package Introduction;//class Animal{
//    void eat(){
//        System.out.println("This animal eats");
//    }
//}class Dog extends Animal{
//
//    void bark(){
//        System.out.println("Dog barks!");
//    }
//}
//class Engine {
//    void start(){
//        System.out.println("The engine starts");
//    }
//}
//class Car{
//    Engine engine = new Engine();
//    void start(){
//        engine.start();
//    }
//}

class Teacher{
    void teach(){
        System.out.println("As Introduction.Teacher teaches");
    }
}
class Students{
    Teacher teacher;
     Students(Teacher teaches){
         this.teacher = teaches;
     }

     void learn(){
         teacher.teach();
         System.out.println("The students start to learn");
     }
}
public class Relationship {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();
//        dog.bark();


//        Car car = new Car();
//        car.start();



 
    }


}
