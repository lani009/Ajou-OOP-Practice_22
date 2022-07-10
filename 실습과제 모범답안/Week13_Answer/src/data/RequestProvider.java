package data;

/**
 * 각 지역의 서버로부터 전달된 요청({@link ViewUpdateRequest})을
 * 일시적으로 담고 있기 위한 기능을 제공한다.
 */
public interface RequestProvider {
    /**
     * offer 메서드는 서버로 부터 전달된 {@link ViewUpdateRequest}를 버퍼에 일시적으로 담는 기능을 수행한다.
     * 
     * @param data 일시적으로 담고 있을 데이터
     */
    public void offer(ViewUpdateRequest data);

    /**
     * poll 메서드는 {@code offer} 메서드를 통해 일시적으로 저장된 요청을
     * 반환하는 기능을 수행한다. 이 때, 먼저 offer된 요청이 먼저 poll되는 방식.
     * 즉 Queue의 형태로 구현되어야 한다. 또한 poll된 객체는 버퍼에서 삭제한다.
     * @return 제일 먼저 들어온 서버의 요청사항
     */
    public ViewUpdateRequest poll();
}
