package assignment.hw06.drone;

public class Quadrotor extends Drone {
    private int trueMovableDistance;

    public Quadrotor(Point position, String droneCode, int searchRange, int movableDistance) {
        super(position, droneCode, searchRange, movableDistance);
        this.trueMovableDistance = (int) Math.round(super.movableDistance * 0.5);
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
    public int getMovableDistance() {
        return this.trueMovableDistance;
    }

    @Override
    public String toString() {
        return String.format(
                "drone type: Quadrotor  drone code: %10s\nx: %2d  y: %2d  search range: %d  movable distance: %d\n",
                droneCode,
                position.getPositionX(),
                position.getPositionY(), getSearchRange(), getMovableDistance());
    }
}
