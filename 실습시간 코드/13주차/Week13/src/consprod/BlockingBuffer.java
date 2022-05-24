package consprod;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingBuffer implements Buffer {
    private BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();

    @Override
    public void put(int value) {
        try {
            queue.put(value);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public int get() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return 0;
        }
    }
}
