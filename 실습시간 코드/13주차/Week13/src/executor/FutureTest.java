package executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        Future<Integer> future = pool.submit(new Counter());
        System.out.println(future.get());
        pool.shutdown();
    }

}

class Counter implements Callable<Integer> {
    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += 1;
        }
        return sum;
    }
}
