package assignment.hw07.drone;

public class Predator extends AttackDrone {
    public Predator(Point position, String droneCode, int searchRange, int movableDistance) {
        super(position, droneCode, searchRange * 4, movableDistance * 3);
    }

    @Override
    public String toString() {
        return String.format(
                "drone type: Predator  drone code: %10s\nx: %2d  y: %2d  search range: %d  movable distance: %d\n",
                getDroneCode(),
                getPosition().getPositionX(),
                getPosition().getPositionY(), getSearchRange(), getMovableDistance());
    }
}
