package com.important.multiThreading;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}

public class ThreadGroupExample {
    public static void main(String[] args) {
        // Create a ThreadGroup
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        // Create threads and assign them to the ThreadGroup
        Thread t1 = new Thread(group, new MyRunnable(), "Thread-1");
        Thread t2 = new Thread(group, new MyRunnable(), "Thread-2");

        // Start the threads
        t1.start();
        t2.start();

        // Display active thread count in the group
        System.out.println("Active threads in group: " + group.activeCount());

        // List all threads in the group
        group.list();
    }
}

