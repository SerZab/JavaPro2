package de.telran.summary.lesson15_11082023.interrupted;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            boolean isStop = false;
            while (!isStop) {
                System.out.println("Working ...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Flag isInterrupted - ON!");
                    isStop = true;
                }
            }
        });
        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }
}
