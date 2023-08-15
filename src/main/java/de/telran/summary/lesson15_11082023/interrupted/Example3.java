package de.telran.summary.lesson15_11082023.interrupted;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {

            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Working ...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Flag isInterrupted - ON!");
                    Thread.currentThread().interrupt();
                }
            }
        });
        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }
}
