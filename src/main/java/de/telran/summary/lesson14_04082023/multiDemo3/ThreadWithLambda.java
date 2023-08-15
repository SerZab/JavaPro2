package de.telran.summary.lesson14_04082023.multiDemo3;

public class ThreadWithLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread " + Thread.currentThread().getName() + " is running"));
        thread.start();

        System.out.println("Method main is finished");
    }
}
