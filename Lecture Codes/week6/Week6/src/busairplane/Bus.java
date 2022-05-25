package busairplane;

public class Bus extends Transportation {
    private String lineNumber;

    public Bus(String transportationName, String lineNumber) {
        super(transportationName);
        this.lineNumber = lineNumber;
    }

    private void onTheRoad() {
        System.out.println("도로를 달린다");
    }

    @Override
    public void move(int x, int y) {
        onTheRoad();
        super.move(x, y);
    }
}
