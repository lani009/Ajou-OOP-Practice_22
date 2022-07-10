package assignment.hw06.drone;

public class Point {
    private int positionX;
    private int positionY;

    public Point(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setPosition(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }
}
