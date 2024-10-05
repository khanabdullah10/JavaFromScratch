package src.multiThreading.practice;

public class MyThread extends Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}
class Demo2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

    }
}
