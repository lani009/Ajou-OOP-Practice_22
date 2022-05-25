package writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class BufferedWriterTest {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(userDir, "write test.txt")))) {
            writer.write("Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
