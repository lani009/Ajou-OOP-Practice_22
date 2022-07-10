package main;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class UAVData {
	private Location currentLocation;
	@XmlElement(name = "UAV")
	private List<UAV> uavList = new ArrayList<>();

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public List<UAV> getUavList() {
		return uavList;
	}
}
