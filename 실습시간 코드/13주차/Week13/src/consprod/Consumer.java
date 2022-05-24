package consprod;

import java.util.Random;

public class Consumer implements Runnable {
    private Random rand = new Random(System.currentTimeMillis());
    private Buffer buffer;
    private int iterN;

    public Consumer(Buffer buffer, int iterN) {
        this.buffer = buffer;
        this.iterN = iterN;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < iterN; i++) {
            int got = buffer.get();
            sum += got;

            System.out.printf("C %s got %d,  sum %d\n", Thread.currentThread().getName(), got, sum);
            try {
                Thread.sleep(rand.nextInt(2000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
