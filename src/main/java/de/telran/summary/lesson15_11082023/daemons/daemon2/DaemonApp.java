package de.telran.summary.lesson15_11082023.daemons.daemon2;

public class DaemonApp {
    public static void main(String[] args) {
        // --------
        var worker = new Thread(() -> {
            for (int i = 0; i < 3; i++) {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                }

                var threadName = Thread.currentThread().getName();
                System.out.println("Thread name is executing " + threadName);
            }
        }, "Worker");
        //-------

        var daemon = new Thread(() -> {
            while (true) {
                // -----

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

                var threadName = Thread.currentThread().getName();
                System.out.println("Thread name is executing " + threadName);

            }

        }, "Daemon");

        worker.start();
        daemon.setDaemon(true);
        daemon.start();

        var threadName = Thread.currentThread().getName();
        System.out.println("Thread name is executing " + threadName);
    }
}
