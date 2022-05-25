package nio;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");

        File f = new File(userDir, "test.txt");

        System.out.println(f.getAbsolutePath());
        System.out.println(f.exists());
        System.out.println(f.length());

        for (String list : new File(userDir).list()) {
            System.out.println(list);
        }
    }
}
