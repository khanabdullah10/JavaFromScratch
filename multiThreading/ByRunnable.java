package src.multiThreading;

public class ByRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hey this is run implemented method from Runnable interface");
    }

    public static void main(String[] args) {
        ByRunnable r = new ByRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
