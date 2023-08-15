package de.telran.summary.lesson15_11082023.synchronization.example1;

public class CounterApp {
    public static void main(String[] args) {
        Counter counter = new Counter();

        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {}


        System.out.println(counter.getCount());
    }
}
