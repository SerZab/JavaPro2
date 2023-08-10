package de.telran.javaPro.lesson28_08082023.task3;

public class Clock extends Thread{
    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(1000);
                System.out.println("Тик");
                Thread.sleep(1000);
                System.out.println("Так");
            } catch (InterruptedException ignored) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ignored1) {

                }
            }
        }
    }
}
