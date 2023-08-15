package de.telran.summary.lesson15_11082023.interrupted;

public class Example2_2 implements Runnable{

    private boolean stop;


    @Override
    public void run() {
        while (!stop) {
            System.out.println("Thread is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    public void stopThread() {
        stop = true;
    }

    public static void main(String[] args) throws InterruptedException {
        Example2_2 ie = new Example2_2();

        Thread thread = new Thread(ie);
        thread.start();
        Thread.sleep(5000);
        ie.stopThread();
    }
}
