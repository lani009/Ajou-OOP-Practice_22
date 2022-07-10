package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXB;

public class App {

	public static void main(String[] args) {
		int key = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("./key.txt"))) {
			key = getKey(br.lines().collect(Collectors.toList()));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		UAVData data;
		try {
			URL url = new URL(String.format(
					"https://raw.githubusercontent.com/lani009/Ajou-OOP-Practice_22/main/data/server/%d.xml", key));
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			data = JAXB.unmarshal(connection.getInputStream(), UAVData.class);

		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		Location myLocation = data.getCurrentLocation();
		UAV closestUAV = data.getUavList().get(0);
		for (UAV uav : data.getUavList()) {
			if (getDistance(myLocation, uav.getLocation()) < getDistance(myLocation, closestUAV.getLocation())) {
				closestUAV = uav;
			}
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("./result.txt"))) {
			bw.write(closestUAV.getCodeName());
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static double getDistance(Location a, Location b) {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}

	public static int getKey(List<String> textLine) {
		return textLine.stream().mapToInt(e -> {
			String[] numStr = e.split(" ");
			int val = Integer.parseInt(numStr[1]);
			int mod = Integer.parseInt(numStr[0] + "1");
			return val * mod;
		}).sum();
	}

}
