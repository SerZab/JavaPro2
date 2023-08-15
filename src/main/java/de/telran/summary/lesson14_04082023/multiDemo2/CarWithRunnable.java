package de.telran.summary.lesson14_04082023.multiDemo2;

public class CarWithRunnable implements Runnable {

    private final String model;

    public CarWithRunnable(String model) {
        this.model = model;
    }

    @Override
    public void run(){
        try {
            System.out.println("Start! " + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException exception) {}

        System.out.println("Car " + model + " is being driven by thread " + Thread.currentThread().getName());
    }

}
