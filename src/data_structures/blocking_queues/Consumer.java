package data_structures.blocking_queues;

import java.util.concurrent.BlockingQueue;

/**
 * @ Author NMuchiri
 **/
public class Consumer implements Runnable{

    BlockingQueue<String> blockingQueue;
    public Consumer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                String element = this.blockingQueue.take();
                System.out.println("===== CONSUMED ELEMENT =====" + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
