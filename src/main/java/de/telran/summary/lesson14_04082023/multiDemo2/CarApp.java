package de.telran.summary.lesson14_04082023.multiDemo2;

public class CarApp {
    public static void main(String[] args) throws InterruptedException {
        CarUtil cu = new CarUtil();
        cu.startThread();
        Thread.sleep(200);

        System.out.println("Method continues execution... Main method is executed by thread " +
                Thread.currentThread().getName());
    }
}
