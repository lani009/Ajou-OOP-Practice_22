package assignment.hw07.drone;

public class Quadrotor extends Drone {
    public Quadrotor(Point position, String droneCode, int searchRange, int movableDistance) {
        super(position, droneCode, searchRange, (int) Math.round(movableDistance * 0.5));
    }

    @Override
    public String toString() {
        return String.format(
                "drone type: Quadrotor  drone code: %10s\nx: %2d  y: %2d  search range: %d  movable distance: %d\n",
                getDroneCode(),
                getPosition().getPositionX(),
                getPosition().getPositionY(), getSearchRange(), getMovableDistance());
    }
}
