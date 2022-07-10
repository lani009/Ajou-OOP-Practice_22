package assignment.hw06.drone;

import java.util.ArrayList;
import java.util.List;

public class DroneManager {
    private List<Drone> droneList = new ArrayList<>();

    public DroneManager() {
    }

    public void addDrone(Drone drone) {
        droneList.add(drone);
    }

    public void removeDrone(String droneCode) {
        for (int i = 0; i < droneList.size(); i++) {
            if (droneList.get(i).getDroneCode().equals(droneCode)) {
                droneList.remove(i);
                break;
            }
        }
    }

    public void removeDrone(int index) {
        droneList.remove(index);
    }

    public Drone getDrone(String droneCode) {
        for (Drone drone : droneList) {
            if (drone.getDroneCode().equals(droneCode)) {
                return drone;
            }
        }
        return null;
    }

    public Drone getDrone(int index) {
        return droneList.get(index);
    }

    public List<Drone> getDroneList() {
        return droneList;
    }

    public void setTarget(int positionX, int positionY) {
        Drone.target.setPosition(positionX, positionY);
    }
}
