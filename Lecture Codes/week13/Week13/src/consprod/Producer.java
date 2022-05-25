package consprod;

import java.util.Random;

public class Producer implements Runnable {
    private Random rand = new Random(System.currentTimeMillis());
    private Buffer buffer;
    private int iterN;

    public Producer(Buffer buffer, int iterN) {
        this.buffer = buffer;
        this.iterN = iterN;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < iterN; i++) {
            buffer.put(i);
            System.out.printf("P %s put %d,  sum %d\n", Thread.currentThread().getName(), i, sum);
            sum += i;
            try {
                Thread.sleep(rand.nextInt(2000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
