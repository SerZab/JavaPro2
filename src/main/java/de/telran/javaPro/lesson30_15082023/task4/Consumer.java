package de.telran.javaPro.lesson30_15082023.task4;

import java.util.concurrent.BlockingQueue;
public class Consumer extends Thread{
    BlockingQueue<Message> blockingQueue;

    public Consumer(BlockingQueue<Message> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while (true){
            try {
                Message message = blockingQueue.take();
                if (message.getContent().equals("exit")) {
                    break;
                } else {
                    System.out.println("Consumed: " + message.getContent());
                    Thread.sleep(message.getId() * 500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
