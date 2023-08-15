package de.telran.summary.lesson14_04082023.multiJoinDemo3;

public class DemoThread3 extends Thread{

    private final double size;

    private double result;

    public DemoThread3(double size) {
        this.size = size;
    }

    public double getResult() {
        return result;
    }

    @Override
    public void run() {
        result = 0;
        for (int i = 0; i <= size ; i++) {
            result += i;
        }
    }
}
