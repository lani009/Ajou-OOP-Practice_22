import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import data.ConcurrentRequestProvider;
import data.ServerConnection;
import data.ServerType;
import object.Video;
import server.ServerProcessor;

public class App {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        ServerConnection a = new ServerConnection(ConcurrentRequestProvider.class);
        List<Video> videoList = a.getExistVideoNames().stream().map((name) -> new Video(name)).collect(Collectors.toList());

        pool.execute(new ServerProcessor(ServerType.KOREA, videoList, a));
        pool.execute(new ServerProcessor(ServerType.KOREA, videoList, a));
        pool.execute(new ServerProcessor(ServerType.EUROPE, videoList, a));
        pool.execute(new ServerProcessor(ServerType.JAPAN, videoList, a));
        pool.execute(new ServerProcessor(ServerType.JAPAN, videoList, a));
        pool.execute(new ServerProcessor(ServerType.NORTH_AMERICA, videoList, a));
        pool.execute(new ServerProcessor(ServerType.NORTH_AMERICA, videoList, a));
        pool.execute(new ServerProcessor(ServerType.NORTH_AMERICA, videoList, a));
        pool.shutdown();
        pool.awaitTermination(10000, TimeUnit.DAYS);
        videoList.stream().forEach(e -> System.out.printf("%3d %s%n", e.getViewCount(), e.getName()));
    }
}
