package src.typesOfFunctional_Interface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        return "Hey this is Callable";
    }
}


public class MyRunnable {
    public static void main(String[] args) {

        /*** Runnable Interface ***/

        Runnable myRunnable = () -> System.out.println("Hello from MyRunnable!");
        Thread thread = new Thread(myRunnable);
        thread.start();

        MyCallable mycall = new MyCallable();
//        ExecutorService executor = ExecutorService


    }
}
