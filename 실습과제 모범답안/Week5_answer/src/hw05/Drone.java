package hw05;

public class Drone {
    private Point position;
    private String droneCode;
    private int searchRange;
    public static Point target = new Point(0, 0);

    public Drone(Point position, String droneCode, int searchRange) {
        this.position = position;
        this.droneCode = droneCode;
        this.searchRange = searchRange;
    }

    public void setPosition(int x, int y) {
        position.setPosition(x, y);
    }

    public Point getPosition() {
        return position;
    }

    public String getDroneCode() {
        return droneCode;
    }

    public int getSearchRange() {
        return searchRange;
    }

    public boolean isTargetInRange() {
        return DroneUtil.calculateDistance(this.getPosition(), Drone.target) < searchRange;
    }

    @Override
    public String toString() {
        return String.format("drone code: %10s  x: %2d  y: %2d  search range: %d\n", droneCode, position.getPositionX(), position.getPositionY(), searchRange);
    }
}
