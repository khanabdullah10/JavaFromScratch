package src.multiThreading;


class ThreadDemo extends Thread{

    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread Child");
        }
    }

}

public class MyThread {

    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println("Main Thread");
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().start();
        ThreadDemo t = new ThreadDemo();
//        t.start();

    }

}
