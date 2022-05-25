package busairplane;

public class Airplane extends Transportation {
    private String airplaneCode;

    public Airplane(String transportationName, String airplaneCode) {
        super(transportationName);
        this.airplaneCode = airplaneCode;
    }

    private void fly() {
        System.out.println("비행 중");
    }

    @Override
    public void move(int x, int y) {
        fly();
        super.move(x, y);
    }
}
