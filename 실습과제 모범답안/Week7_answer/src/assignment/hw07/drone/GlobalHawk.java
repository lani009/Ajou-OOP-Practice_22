package assignment.hw07.drone;

public class GlobalHawk extends AttackDrone {
    public GlobalHawk(Point position, String droneCode, int searchRange, int movableDistance) {
        super(position, droneCode, searchRange * 3, movableDistance * 2);
    }

    @Override
    public String toString() {
        return String.format(
                "drone type: GlobalHawk  drone code: %10s\nx: %2d  y: %2d  search range: %d  movable distance: %d\n",
                getDroneCode(),
                getPosition().getPositionX(),
                getPosition().getPositionY(), getSearchRange(), getMovableDistance());
    }

}
