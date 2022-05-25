public class Coin {
    private String coinName;    // 코인 이름
    private double price;       // 가격
    private int qty;            // 보유 개수

    // TODO 생성자를 작성하세요

    /**
     * 평가 금액 (가격 * 보유 개수)
     */
    public int calcPrice() {
        // TODO 메소드를 채워주세요
        return 0;
    }

    @Override
    public String toString() {
        return String.format("코인이름: %s  가격: %d  보유수량: %d  평가 금액: %d", coinName, price, qty, calcPrice());
    }
}
