package Threads;

public class ThreadAnn {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (!Thread.interrupted()) {
                System.out.println("this is t1");
            }
        });
        Thread t2 = new Thread(() -> {
            while (!Thread.interrupted()) {
                System.out.println("this is t2");
            }
        });

        t1.start();
        t2.start();

        Thread.sleep(5000);
        t1.interrupt();
        t2.interrupt();
    }
}
