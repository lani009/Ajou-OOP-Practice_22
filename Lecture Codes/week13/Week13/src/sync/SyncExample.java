package sync;

public class SyncExample {
    static ViewCounter vc = new ViewCounter();

    public static void main(String[] args) throws InterruptedException {
        // 유튜브는 쾌적한 스트리밍 환경을 제공하기 위해서
        // 여러 나라에 각각의 서버를 두고 있다.
        // 이 때 여러 서버에서 동시에 조회수가 계속 업데이트 되는 상황을 가정해보자.

        Thread koreaServer = new Thread(SyncExample::forCount);

        Thread japanServer = new Thread(SyncExample::forCount);

        Thread europeServer = new Thread(SyncExample::forCount);

        koreaServer.start();
        japanServer.start();
        europeServer.start();

        koreaServer.join();
        japanServer.join();
        europeServer.join();

        System.out.println(vc.getCount());
    }

    public static void forCount() {
        for (int i = 0; i < 100000; i++) {
            vc.viewCount();
        }
    }
}

/**
 * 조회수 카운터
 */
class ViewCounter {
    private int count = 0;

    /**
     * 누군가가 영상을 조회했을 경우
     */
    public void viewCount() {
        synchronized (this) {
            count = count + 1;
        }
    }

    public int getCount() {
        return count;
    }
}
