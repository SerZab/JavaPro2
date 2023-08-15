package de.telran.javaPro.lesson30_15082023.task4;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {
    BlockingQueue<Message> blockingQueue;

    public Producer(BlockingQueue<Message> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 35; i++) {
            Message message = new Message(String.format("Number of message is %d", i+1), i+1);

            blockingQueue.add(message);
            System.out.println("Added - " + message.getId() + " " + message.getContent());

            System.out.println("Blocking size is - " + blockingQueue.size());
            try {
                Thread.sleep((i+1)*200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        blockingQueue.add(new Message("exit", 0));
    }
}
