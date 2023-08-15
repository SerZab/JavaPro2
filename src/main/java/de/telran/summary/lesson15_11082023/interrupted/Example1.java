package de.telran.summary.lesson15_11082023.interrupted;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            long count = 0;
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Working ...");

                for (int i = 0; i < 100000000; i++) {
                    count++;
                }

//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println("Flag isInterrupted - ON!");
//                }
            }
        });
        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }
}
