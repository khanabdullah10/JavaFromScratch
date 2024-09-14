package src.exceptionHandling;


//1. Write a Java program that throws an exception and catches it using a try-catch block.
public class Question1 {

    public static void main(String[] args) {

        try{

            int a = 10/0;

        }catch(ArithmeticException e){

            System.out.println(e); // / java.lang.ArithmeticException: / by zero
            System.out.println(e.fillInStackTrace()); // / java.lang.ArithmeticException: / by zero
            System.out.println(e.getCause()); // null
            System.out.println(e.getLocalizedMessage()); // / by zero
            System.out.println(e.getMessage());// / by zero
            System.out.println(e.getStackTrace()); // [Ljava.lang.StackTraceElement;@65ab7765
            System.out.println(e.getSuppressed()); // [Ljava.lang.Throwable;@1b28cdfa
//            System.out.println(e.initCause(e));


        }

    }

}
