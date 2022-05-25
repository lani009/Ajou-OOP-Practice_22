package collections.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(System.getProperty("user.dir"), "word.txt"));
        String text = scan.nextLine();
        text = text.toLowerCase();

        String[] wordList = text.split(" ");

        Map<String, Integer> wordFreq = new HashMap<>();
        // ...

        scan.close();

        for (Map.Entry<String, Integer> freqSet : wordFreq.entrySet()) {
            System.out.printf("%s = %d\n", freqSet.getKey(), freqSet.getValue());
        }

        wordFreq.entrySet().forEach(e -> System.out.printf("%s = %d\n", e.getKey(), e.getValue()));
    }
}
