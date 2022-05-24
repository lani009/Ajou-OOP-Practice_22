package Threads;

public class ThreadP1 {
    public static void main(String[] args) {
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                System.out.printf("Thread 1 %d\n", i);
            }
        });
        t2.start();
        System.out.println("HIHI");
    }
}
