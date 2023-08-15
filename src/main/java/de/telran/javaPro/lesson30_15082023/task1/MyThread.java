package de.telran.javaPro.lesson30_15082023.task1;

public class MyThread extends Thread{
    @Override
    public void run() {

        System.out.printf("Поток %s начал работу.%n", getName());
        try {
            Thread.sleep(3000);
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Поток %s завершил работу.%n", getName());
    }
}
