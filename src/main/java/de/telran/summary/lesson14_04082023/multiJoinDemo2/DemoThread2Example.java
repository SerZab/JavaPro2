package de.telran.summary.lesson14_04082023.multiJoinDemo2;

public class DemoThread2Example {
    public static void main(String[] args) throws InterruptedException {
        DemoThread2 thread1 = new DemoThread2();
        DemoThread2 thread2 = new DemoThread2();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        double result = thread1.getResult() + thread2.getResult();

        System.out.println("Total result = " + result);
    }
}
