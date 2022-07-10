package assignment.hw07.drone;

public interface Movable {
    public boolean setPosition(int x, int y);

    public boolean setPosition(Point position);

    public Point getPosition();
}
