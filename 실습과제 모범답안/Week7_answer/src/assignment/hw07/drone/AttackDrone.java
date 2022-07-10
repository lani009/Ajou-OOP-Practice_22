package assignment.hw07.drone;

public abstract class AttackDrone extends Drone implements Attackable {
    protected AttackDrone(Point position, String droneCode, int searchRange, int movableDistance) {
        super(position, droneCode, searchRange, movableDistance);
    }

    @Override
    public void launchMissile(Point position) {
        if (DroneUtil.calculateDistance(getPosition(), position) <= getSearchRange()) {
            System.out.printf("%10s가 (%d, %d)에 미사일을 발사함\n", getDroneCode(), position.getPositionX(), position.getPositionY());
        } else {
            System.out.printf("%10s는 (%d, %d)와 멀리 떨어져 있습니다.\n", getDroneCode(), position.getPositionX(), position.getPositionY());
        }
    }

    @Override
    public void throwBomb(Point position) {
        if (DroneUtil.calculateDistance(getPosition(), position) <= getSearchRange()) {
            System.out.printf("%10s가 (%d, %d)에 폭탄을 투하함\n", getDroneCode(), position.getPositionX(), position.getPositionY());
        } else {
            System.out.printf("%10s는 (%d, %d)와 멀리 떨어져 있습니다.\n", getDroneCode(), position.getPositionX(), position.getPositionY());
        }
    }
}
