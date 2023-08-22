package de.telran.practice.lesson32_22082023;

public class MyThread extends Thread{
    private int start;
    private int end;
    private int sum;

    public MyThread (int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Сумма от " + start + " до " + end + " = " + sum);
    }
}
