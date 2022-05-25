package Threads;

public class ThreadLambda {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass tc1 = new ThreadClass("T1");
        ThreadClass tc2 = new ThreadClass("T2");

        Thread th1 = new Thread(tc1);
        Thread th2 = new Thread(tc2);

        th1.start();
        th2.start();

        Thread.sleep(5000);
        tc1.stop();
        tc2.stop();
    }
}
