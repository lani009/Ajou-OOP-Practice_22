package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class BufferedTest {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");

        try (BufferedReader reader = new BufferedReader(new FileReader(Path.of(userDir, "test.txt").toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
