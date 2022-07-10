package assignment.hw06.drone;

public class GlobalHawk extends Drone {
    private int trueMovableDistance;
    private int trueSearchRange;

    public GlobalHawk(Point position, String droneCode, int searchRange, int movableDistance) {
        super(position, droneCode, searchRange, movableDistance);
        this.trueMovableDistance = super.movableDistance * 2;
        this.trueSearchRange = super.searchRange * 3;
    }

    @Override
    public boolean setPosition(int x, int y) {
        if (DroneUtil.calculateDistance(position, new Point(x, y)) <= trueMovableDistance) {
            position.setPosition(x, y);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isTargetInRange() {
        return DroneUtil.calculateDistance(this.getPosition(), Drone.target) <= trueSearchRange;
    }

    @Override
    public int getMovableDistance() {
        return this.trueMovableDistance;
    }

    @Override
    public int getSearchRange() {
        return this.trueSearchRange;
    }

    @Override
    public String toString() {
        return String.format(
                "drone type: GlobalHawk  drone code: %10s\nx: %2d  y: %2d  search range: %d  movable distance: %d\n",
                droneCode,
                position.getPositionX(),
                position.getPositionY(), getSearchRange(), getMovableDistance());
    }
}
