package com.important.multiThreading;

import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Define tasks
        Runnable task1 = () -> System.out.println(Thread.currentThread().getName() + " - Task 1");
        Runnable task2 = () -> System.out.println(Thread.currentThread().getName() + " - Task 2");
        Runnable task3 = () -> System.out.println(Thread.currentThread().getName() + " - Task 3");

        // Submit tasks to the pool
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);

        // Shutdown the executor
        executor.shutdown();
    }
}

