package assignment.hw06.drone;

public class Drone {
    protected Point position;
    protected String droneCode;
    protected int searchRange;
    protected int movableDistance;
    public static Point target = new Point(0, 0);

    public Drone(Point position, String droneCode, int searchRange, int movableDistance) {
        this.position = position;
        this.droneCode = droneCode;
        this.searchRange = searchRange;
        this.movableDistance = movableDistance;
    }

    public boolean setPosition(int x, int y) {
        if (DroneUtil.calculateDistance(position, new Point(x, y)) <= movableDistance) {
            position.setPosition(x, y);
            return true;
        } else {
            return false;
        }
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

    public int getMovableDistance() {
        return movableDistance;
    }

    public boolean isTargetInRange() {
        return DroneUtil.calculateDistance(this.getPosition(), Drone.target) <= searchRange;
    }

    @Override
    public String toString() {
        return String.format(
                "drone type: default  drone code: %10s\nx: %2d  y: %2d  search range: %d  movable distance: %d\n",
                droneCode,
                position.getPositionX(),
                position.getPositionY(), searchRange, movableDistance);
    }
}
