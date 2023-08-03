package de.telran.summary.lesson14.multiDemo3;

public class ThreadWithLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        thread.start();

        System.out.println("Method main is finished");
    }
}
