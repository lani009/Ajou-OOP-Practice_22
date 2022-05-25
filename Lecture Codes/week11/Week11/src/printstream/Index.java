package printstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw1 = new BufferedWriter(new FileWriter("PATH"));
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out));
        FileWriter fw = new FileWriter("PATH");

        BufferedReader br1 = new BufferedReader(new FileReader("PATH"));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader("PATH");

        Scanner scanFile = new Scanner(new File("PATH"));
    }
}
