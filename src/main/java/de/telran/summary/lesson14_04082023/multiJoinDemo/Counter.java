package de.telran.summary.lesson14_04082023.multiJoinDemo;

public class Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void increment() {count++;}
}
