package de.telran.javaPro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {
    public static void main(String[] args) {
        int numPhilosophers = 3;
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        Object[] forks = new Object[numPhilosophers];

        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < numPhilosophers; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % numPhilosophers];

            if (i == numPhilosophers - 1) {
                // To avoid potential deadlock, reverse the order of forks for the last philosopher
                philosophers[i] = new Philosopher(rightFork, leftFork);
            } else {
                philosophers[i] = new Philosopher(leftFork, rightFork);
            }

            Thread thread = new Thread(philosophers[i], "Philosopher " + (i + 1));
            thread.start();
        }
    }

    public static class Philosopher implements Runnable {
        private Object leftFork;
        private Object rightFork;
        private Lock lock = new ReentrantLock();

        public Philosopher(Object leftFork, Object rightFork) {
            this.leftFork = leftFork;
            this.rightFork = rightFork;
        }

        private void doAction(String action) throws InterruptedException {
            System.out.println(Thread.currentThread().getName() + " " + action);
            Thread.sleep((int) (Math.random() * 100));
        }

        @Override
        public void run() {
            try {
                while (true) {
                    doAction(": Thinking");
                    lock.lock();
                    try {
                        doAction(": Picked up left fork");
                        Thread.sleep(100);  // Simulating time taken to pick up the second fork
                        doAction(": Picked up right fork - eating");
                        Thread.sleep(100);  // Simulating eating
                        doAction(": Put down right fork");
                    } finally {
                        lock.unlock();
                        doAction(": Put down left fork. Back to thinking");
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}