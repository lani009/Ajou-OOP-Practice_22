package Threads;

public class ThreadClass implements Runnable {
    private String name;
    private boolean runState = false;
    public ThreadClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        runState = true;
        while (runState) {
            System.out.println(name);
        }
    }

    public void stop() {
        runState = false;
    }

}
