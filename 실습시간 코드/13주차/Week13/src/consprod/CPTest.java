package consprod;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CPTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        Buffer buffer = new UnsynchronizedBuffer();

        pool.execute(new Producer(buffer, 10));
        pool.execute(new Consumer(buffer, 10));

        pool.shutdown();
        
    }
}
