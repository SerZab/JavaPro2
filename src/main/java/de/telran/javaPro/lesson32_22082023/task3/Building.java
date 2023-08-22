package de.telran.javaPro.lesson32_22082023.task3;

import java.util.Date;

public class Building implements Runnable {

    private String city;
    private String[] stages;
    private boolean printTime;

    public Building(String city, String[] stages, boolean printTime) {
        this.city = city;
        this.stages = stages;
        this.printTime = printTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < stages.length; i++) {
            if (printTime) {
                System.out.printf("%s: %s, %s -> %s%n",
                        city, stages[i], Thread.currentThread().getName(), new Date());
            } else {
                System.out.printf("%s: %s, %s%n",
                        city, stages[i], Thread.currentThread().getName());
            }

            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                System.out.println("Ошибка!");
            }
        }
    }
}