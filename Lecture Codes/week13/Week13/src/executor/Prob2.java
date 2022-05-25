package executor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Prob2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Random rand = new Random(System.currentTimeMillis());
        double[] numList = DoubleStream.generate(() -> rand.nextDouble() - 0.5).limit(100000000).toArray();

        int threadsCount = Runtime.getRuntime().availableProcessors() * 2;

        ExecutorService pool = Executors.newFixedThreadPool(threadsCount);

        long t1 = System.currentTimeMillis(); // 시간 측정 스타트
        double sum = 0; // 결과 값을 담을 변수

        // 아래 for 문은 싱글스레드 기반이다.
        for (int i = 0; i < numList.length; i++) {
        sum += numList[i];
        }
        long t2 = System.currentTimeMillis(); // 시간 측정 끝
        
        System.out.printf("sum: %f\n", sum);
        System.out.printf("time: %dms\n", (t2 - t1));
        System.out.println();

        t1 = System.currentTimeMillis();
        sum = 0;
        List<DoubleCounter> caList = new ArrayList<>();
        for (int i = 0; i < threadsCount; i++) {
            caList.add(new DoubleCounter(numList.length/(threadsCount) * i, numList.length/(threadsCount) * (i+1), numList));
        }
        List<Future<Double>> futureList =  pool.invokeAll(caList);

        sum = futureList.stream().mapToDouble(value -> {
            try {
                return value.get();
            } catch (InterruptedException | ExecutionException e) {
                Thread.currentThread().interrupt();
                return 0;
            }
        }).sum();
        t2 = System.currentTimeMillis();

        System.out.printf("sum: %f\n", sum);
        System.out.printf("time: %dms\n", (t2 - t1));
        pool.shutdown();

    }
}

class DoubleCounter implements Callable<Double> {
    private int start;
    private int end;
    private double[] array;

    public DoubleCounter(int start, int end, double[] array) {
        this.start = start;
        this.end = end;
        this.array = array;
    }

    @Override
    public Double call() throws Exception {
        double sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
