package web;

import java.io.InputStream;
import java.net.HttpURLConnection;

import java.net.URL;

public class BoxOfficeTest {
	public static void main(String[] args) throws Exception {
		URL url;
		HttpURLConnection connection = null;
		url = new URL("https://raw.githubusercontent.com/lani009/Ajou-OOP-Practice_22/main/movie.xml");
		connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("GET");

		InputStream inputStream = connection.getInputStream(); // InputStream to JAXB

	}
}
