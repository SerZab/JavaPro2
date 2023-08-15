package de.telran.summary.lesson14_04082023.multiDemo2;

public class Car extends Thread {

    private final String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void run(){
        try {
            System.out.println("Start! " + getName());
            Thread.sleep(1000);
        } catch (InterruptedException exception) {}

        System.out.println("Car " + model + " is being driven by thread " + Thread.currentThread().getName());
    }

}
