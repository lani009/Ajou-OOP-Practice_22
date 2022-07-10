package data;

/**
 * 서버의 요청사항 포멧
 * 각 지역의 서버는 이 클래스의 객체를 통해 요청을 전달한다.
 */
public class ViewUpdateRequest {
    private final String VIDEO_NAME;
    private final int VIEW_COUNT;

    ViewUpdateRequest(String VideoName, int viewCount) {
        this.VIDEO_NAME = VideoName;
        this.VIEW_COUNT = viewCount;
    }

    /**
     * 요청할 영상의 제목
     * 
     * @return 요청할 영상의 제목
     */
    public String getVideoName() {
        return this.VIDEO_NAME;
    }

    /**
     * 얼만큼 조회수를 증가시켜야 하는지.
     * 
     * @return 조회수의 증가수
     */
    public int getViewCount() {
        return this.VIEW_COUNT;
    }

}
