package de.telran.summary.lesson15_11082023.daemons.daemon;

public class DatabaseServer implements Runnable{
    @Override
    public void run() {
        while (true) {
            // вносим изменения в базу данных
            // ждем 10 минут
            try {
                Thread.sleep(600000);
            } catch (InterruptedException e) {}
        }
    }
}
