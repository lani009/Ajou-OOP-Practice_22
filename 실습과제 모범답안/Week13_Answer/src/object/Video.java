package object;

public class Video {
    private final String name;
    private int viewCount = 0;

    public Video(String name) {
        this.name = name;
    }

    public synchronized void addView(int view) {
        this.viewCount += view;
    }

    public String getName() {
        return name;
    }

    public int getViewCount() {
        return viewCount;
    }
}
