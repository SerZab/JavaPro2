package de.telran.javaPro.lesson29_10082023;

import java.util.concurrent.locks.ReentrantLock;

public class MutexExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(() -> sharedResource.doWork("Thread 1"));
        Thread thread2 = new Thread(() -> sharedResource.doWork("Thread 2"));

        thread1.start();
        thread2.start();
    }
}

class SharedResource {
    private final ReentrantLock mutex = new ReentrantLock();

    public void doWork(String threadName) {
        mutex.lock(); // Acquire the lock

        try {
            System.out.println(threadName + " is working...");
            Thread.sleep(5000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            mutex.unlock(); // Release the lock
            System.out.println(threadName + " finished.");
        }
    }
}