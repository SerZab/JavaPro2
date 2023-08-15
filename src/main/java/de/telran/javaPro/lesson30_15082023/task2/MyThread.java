package de.telran.javaPro.lesson30_15082023.task2;

public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.printf("Поток %s начал работу.\n", getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Поток %s завершил работу.\n", getName());
    }
}

