package hw02;

import java.util.Scanner;

public class PhoneticDecoder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int lineCount = scan.nextInt();

        String[] decodedLines = new String[lineCount];

        for (int i = 0; i < lineCount; i++) {
            String alphabet;

            switch (scan.next()) {
                case "Alfa":
                    alphabet = "A";
                    break;

                case "Bravo":
                    alphabet = "B";
                    break;

                case "Charlie":
                    alphabet = "C";
                    break;

                case "Delta":
                    alphabet = "D";
                    break;

                case "Echo":
                    alphabet = "E";
                    break;

                case "Foxtrot":
                    alphabet = "F";
                    break;

                case "Golf":
                    alphabet = "G";
                    break;

                case "Hotel":
                    alphabet = "H";
                    break;

                case "India":
                    alphabet = "I";
                    break;

                case "Juliett":
                    alphabet = "J";
                    break;

                case "Kilo":
                    alphabet = "K";
                    break;

                case "Lima":
                    alphabet = "L";
                    break;

                case "Mike":
                    alphabet = "M";
                    break;

                case "November":
                    alphabet = "N";
                    break;

                case "Oscar":
                    alphabet = "O";
                    break;

                case "Papa":
                    alphabet = "P";
                    break;

                case "Quebec":
                    alphabet = "Q";
                    break;

                case "Romeo":
                    alphabet = "R";
                    break;

                case "Sierra":
                    alphabet = "S";
                    break;

                case "Tango":
                    alphabet = "T";
                    break;

                case "Uniform":
                    alphabet = "U";
                    break;

                case "Victor":
                    alphabet = "V";
                    break;

                case "Whiskey":
                    alphabet = "W";
                    break;

                case "X-ray":
                    alphabet = "X";
                    break;

                case "Yankee":
                    alphabet = "Y";
                    break;

                case "Zulu":
                    alphabet = "Z";
                    break;

                default:
                    alphabet = "";
                    break;
            }
            decodedLines[i] = alphabet;
        }
        scan.close();

        for (String alphabet : decodedLines) {
            System.out.print(alphabet);
        }
    }
}
