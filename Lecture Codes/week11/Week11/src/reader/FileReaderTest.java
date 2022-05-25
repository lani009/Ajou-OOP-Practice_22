package reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class FileReaderTest {

	public static void main(String[] args) throws InterruptedException {
		String userDir = System.getProperty("user.dir");

		try (FileReader reader = new FileReader(new File(userDir, "test.txt"))) {
			int ch;
			while ((ch = reader.read()) != -1) {
				System.out.printf("%c", (char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
