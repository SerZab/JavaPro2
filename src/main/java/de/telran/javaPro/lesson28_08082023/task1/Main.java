package de.telran.javaPro.lesson28_08082023.task1;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                this.setName("Поток 1");
                for (int i = 0; i < 10; i++) {
                    System.out.printf("%s: %d%n", this.getName(), i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable run = () -> {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("Поток 2");
            for (int i = 0; i < 10; i++) {
                System.out.printf("%s: %d%n", currentThread.getName(), i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread daemon = new Thread() {
            @Override
            public void run() {
                this.setName("Даемон поток");
                for (int i = 0; i < 10; i++) {
                    System.out.printf("%s: %d%n", this.getName(), i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        thread1.start();
        Thread thread2 = new Thread(run);
        thread2.start();
        daemon.setDaemon(true);
        daemon.start();
    }
}
