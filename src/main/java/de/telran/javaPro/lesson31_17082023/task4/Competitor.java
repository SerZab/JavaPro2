package de.telran.javaPro.lesson31_17082023.task4;

import java.util.concurrent.Phaser;

public class Competitor extends Thread {

    private int delayTime;
    private Phaser phaser;

    public Competitor(String name, int delayTime, Phaser phaser) {
        this.delayTime = delayTime;
        this.phaser = phaser;
        phaser.register();
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delayTime);
            System.out.printf("%s приступил к 1 этапу соревнований.%n", getName());

            Thread.sleep(delayTime);
            System.out.printf("%s закончил 1 этап соревнований.%n", getName());

            phaser.arriveAndAwaitAdvance();

            Thread.sleep(delayTime);
            System.out.printf("%s приступил к 2 этапу соревнований.%n", getName());

            Thread.sleep(delayTime);
            System.out.printf("%s закончил 2 этап соревнований.%n", getName());

            phaser.arriveAndAwaitAdvance();

            Thread.sleep(delayTime);
            System.out.printf("%s приступил к 3 этапу соревнований.%n", getName());

            Thread.sleep(delayTime);
            System.out.printf("%s закончил 3 этап соревнований.%n", getName());
        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }
    }
}
