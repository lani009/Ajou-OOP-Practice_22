package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FixedPool {
    public static void main(String[] args) {
        PrintTask[] tasks = new PrintTask[10];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new PrintTask(i);
        }

        ExecutorService pool = Executors.newFixedThreadPool(4);
        // ExecutorService pool = Executors.newCachedThreadPool();
        // ((ThreadPoolExecutor) pool).getPoolSize();

        for (PrintTask taskObj : tasks) {
            pool.execute(taskObj);
        }
    }
}

class PrintTask implements Runnable {
    private int num;

    public PrintTask(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.printf("Thread%d %d\n", num, i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
