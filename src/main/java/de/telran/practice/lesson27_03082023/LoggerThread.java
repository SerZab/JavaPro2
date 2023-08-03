package de.telran.practice.lesson27_03082023;

import java.time.LocalDateTime;

public class LoggerThread extends Thread {

    public LoggerThread() {
//        setDaemon(true);
    }


    @Override
    public void run() {
        while (true) {
            System.out.println(LocalDateTime.now());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
