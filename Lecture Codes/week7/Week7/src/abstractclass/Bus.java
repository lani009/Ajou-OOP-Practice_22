package abstractclass;

public class Bus extends Transportation {

    private void drive() {
        System.out.println("버스는 운전해서 간다.");
    }

    @Override
    public void move(int x, int y) {
        drive();
        System.out.printf("%d, %d로 이동한다!\n", x, y);
    }
    
}
