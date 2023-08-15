package de.telran.summary.lesson14_04082023.multiJoinDemo3;

public class DemoThread3Example {
    public static void main(String[] args) throws InterruptedException {
        DemoThread3 thread1 = new DemoThread3(1000);
        DemoThread3 thread2 = new DemoThread3(100);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        double result = thread1.getResult() + thread2.getResult();

        System.out.println("Total result = " + result);
    }
}
