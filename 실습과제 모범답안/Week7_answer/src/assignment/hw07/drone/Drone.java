package assignment.hw07.drone;

public abstract class Drone implements Movable {
    private Point position;
    private static Point target;
    private final String DRONE_CODE;
    private final int SEARCH_RANGE;
    private final int MOVABLE_DISTANCE;

    protected Drone(Point position, String droneCode, int searchRange, int movableDistance) {
        this.position = position;
        this.DRONE_CODE = droneCode;
        this.SEARCH_RANGE = searchRange;
        this.MOVABLE_DISTANCE = movableDistance;
    }

    public static void setTarget(int x, int y) {
        target = new Point(x, y);
    }

    public static void setTarget(Point target) {
        setTarget(target.getPositionX(), target.getPositionY());
    }

    public static Point getTarget() {
        return target;
    }

    @Override
    public boolean setPosition(int x, int y) {
        if (DroneUtil.calculateDistance(getPosition(), new Point(x, y)) <= MOVABLE_DISTANCE) {
            position = new Point(x, y);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setPosition(Point position) {
        return setPosition(position.getPositionX(), position.getPositionY());
    }

    public final Point getPosition() {
        return position;
    }

    public String getDroneCode() {
        return DRONE_CODE;
    }

    public int getSearchRange() {
        return SEARCH_RANGE;
    }

    public int getMovableDistance() {
        return MOVABLE_DISTANCE;
    }

    public boolean isTargetInRange() {
        return DroneUtil.calculateDistance(this.getPosition(), getTarget()) <= SEARCH_RANGE;
    }

    @Override
    public abstract String toString();
}
