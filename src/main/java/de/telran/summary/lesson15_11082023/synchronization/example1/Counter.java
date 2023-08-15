package de.telran.summary.lesson15_11082023.synchronization.example1;

public class Counter {

    private int count;

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }
    public int getCount() {
        return count;
    }
}
