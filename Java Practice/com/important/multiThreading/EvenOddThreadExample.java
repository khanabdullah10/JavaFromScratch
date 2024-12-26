package com.important.multiThreading;

class PrintEven implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintOdd implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class EvenOddThreadExample {
    public static void main(String[] args) {
        // Create threads for printing even and odd numbers
        Thread evenThread = new Thread(new PrintEven());
        Thread oddThread = new Thread(new PrintOdd());

        // Start the threads
        evenThread.start();
        oddThread.start();
    }
}
