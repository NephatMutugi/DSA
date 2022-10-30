package data_structures.blocking_queues;

import java.util.concurrent.BlockingQueue;

/**
 * @ Author NMuchiri
 **/
public class Producer implements Runnable{

    BlockingQueue<String> blockingQueue;
    public Producer( BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true){
            long timeMillis = System.currentTimeMillis();

            try {
                this.blockingQueue.put(""+timeMillis);
            } catch (InterruptedException e) {
                System.out.println("Producer was Interrupted");
            }
            sleep(1000);
        }
    }

    private void sleep(long milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("ERROR IN SLEEP METHOD: "+ e.getMessage());
        }
    }
}
