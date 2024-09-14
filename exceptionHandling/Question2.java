package src.exceptionHandling;


// 2. Write a Java program to create a method that takes an integer as
// a parameter and throws an exception if the number is odd.

public class Question2 {

    static void method(int integer){
        try{
            OddNumberException(integer);
        }catch (IllegalArgumentException e){
            System.out.println("Sorry ! ");
            System.out.println(e.getMessage());
        }
    }


    public static void OddNumberException(int integer){

        if(integer % 2 != 0){

            throw new IllegalArgumentException(integer + " is odd number");
        }

    }

    public static void main(String[] args) {
        method(5);
    }
}
