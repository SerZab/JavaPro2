package de.telran.summary.lesson14_04082023.multiJoinDemo2;

public class DemoThread2 extends Thread{

    private double result;

    public double getResult() {
        return result;
    }

    @Override
    public void run() {
        result = 0;
        for (int i = 0; i <= 1000 ; i++) {
            result += i;
        }
    }
}
