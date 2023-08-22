package de.telran.javaPro.lesson32_22082023.task1;

import lombok.AllArgsConstructor;

import java.util.Random;

public class MyThread extends Thread {

    private int id;

    public MyThread(int id) {
        this.id = id;
        start();
    }

    @Override
    public void run() {
        Random random = new Random();
        int millis = random.nextInt(4000) + 1000;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(millis);
                Main.increment(id);
                System.out.printf("Поток %s увеличил значение на %d.%n", getName(), id);
            } catch (InterruptedException e) {
                System.out.println("Ошибка!");
            }
        }
    }
}