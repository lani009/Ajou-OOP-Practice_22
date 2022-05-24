package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExeIndex {
    public static void main(String[] args) {
        ExecutorService fixedPool = Executors.newFixedThreadPool(4);
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        ExecutorService singlePool = Executors.newSingleThreadExecutor();

        fixedPool.execute(() -> {System.out.println("hihi"); try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }});

        fixedPool.execute(() -> {System.out.println("hihi"); try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }});

        fixedPool.execute(() -> {System.out.println("hihi"); try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }});

        fixedPool.execute(() -> {System.out.println("hihi"); try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }});

        fixedPool.execute(() -> {System.out.println("hihi"); try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }});
        fixedPool.shutdown();
    }
}
