package de.telran.javaPro.lesson31_17082023.task3;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        Thread thread1 = new Thread(new Worker(barrier));
        Thread thread2 = new Thread(new Worker(barrier));
        Thread thread3 = new Thread(new Worker(barrier));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Worker implements Runnable {
    private CyclicBarrier barrier;

    public Worker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread started");
            Thread.sleep(1000); // Simulate some work

            barrier.await();

            System.out.println("Thread finished");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
