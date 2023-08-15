package de.telran.summary.lesson14_04082023.multiJoinDemo;

public class CounterRunnable implements Runnable{

    private final Counter counter;

    public CounterRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            counter.increment();
        }
    }
}
