package de.telran.summary.lesson14_04082023.multiJoinDemo;

public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new CounterRunnable(counter));
        Thread thread2 = new Thread(new CounterRunnable(counter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count = " + counter.getCount());


    }
}
