package data;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentRequestProvider implements RequestProvider {
    private Queue<ViewUpdateRequest> queue = new ConcurrentLinkedQueue<>();

    @Override
    public void offer(ViewUpdateRequest data) {
        queue.offer(data);
    }

    @Override
    public ViewUpdateRequest poll() {
        return queue.poll();
    }

}
