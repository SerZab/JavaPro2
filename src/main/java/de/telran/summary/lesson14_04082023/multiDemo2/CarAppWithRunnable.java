package de.telran.summary.lesson14_04082023.multiDemo2;

public class CarAppWithRunnable {
    public static void main(String[] args) {
        CarWithRunnable ferrari = new CarWithRunnable("Ferrari");
        CarWithRunnable bmw = new CarWithRunnable("Bmw");

        var ferrariThread = new Thread(ferrari, "Ferrari - Thread");
        var bmwThread = new Thread(bmw, "BMW - Thread");

        ferrariThread.start();
        bmwThread.start();

        System.out.println("Method continues execution... Main method is executed by thread " +
                Thread.currentThread().getName());
    }
}
