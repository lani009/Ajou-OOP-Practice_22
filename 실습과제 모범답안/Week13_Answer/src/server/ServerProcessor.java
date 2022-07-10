package server;

import java.util.List;

import data.ServerConnection;
import data.ServerType;
import data.ViewUpdateRequest;
import object.Video;

public class ServerProcessor implements Runnable {
    private ServerType serverType;
    private List<Video> videoList;
    private ServerConnection queue;

    public ServerProcessor(ServerType serverType, List<Video> videoList, ServerConnection queue) {
        this.serverType = serverType;
        this.videoList = videoList;
        this.queue = queue;
    }

    private Video getVideoFromList(String videoName) {
        return videoList.stream().filter((t) -> t.getName().equals(videoName)).findFirst().get();
    }

    @Override
    public void run() {
        ViewUpdateRequest data;
        while ((data = queue.getDataRequest(serverType)) != null) {
            getVideoFromList(data.getVideoName()).addView(data.getViewCount());
        }
    }
}
