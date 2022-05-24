package concurrent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConTest {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> map = new HashMap<>();
        List<Set<Integer>> putSetList = new ArrayList<>();

        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            Set<Integer> putSet = new HashSet<>();
            putSetList.add(putSet);
            pool.execute(new PutNum(map, putSet));
        }
        pool.shutdown();
        pool.awaitTermination(100000, TimeUnit.MINUTES);

        for (Set<Integer> set1 : putSetList) {
            for (Set<Integer> set2 : putSetList) {
                if (set1 == set2) {
                    continue;
                }
                Set<Integer> duplicateSet = new HashSet<>();
                duplicateSet.addAll(set1);
                duplicateSet.retainAll(set2);
                for (int dupNum : duplicateSet) {
                    System.out.println(dupNum);
                }
            }
        }
    }
}

class PutNum implements Runnable {
    private Map<Integer, String> map;
    private Set<Integer> putSet;

    public PutNum(Map<Integer, String> map, Set<Integer> putSet) {
        this.map = map;
        this.putSet = putSet;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (map.putIfAbsent(i, String.format("%c", 'A' + i)) == null) {
                putSet.add(i);
            }
        }
    }
}
