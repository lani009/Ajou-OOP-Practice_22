package arith.causedexception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextDownloader {

    public String getDataFromInternet(String uri) throws CannotDownloadException {
        String data = null;
        try {
            InternetDownloader id = new InternetDownloader;
            data = id.getTextData();
        } catch (InternetDisconnetcedException e) {
            throw new CannotDownloadException("Internet 연결이 불가합니다.", e);
        }
        return data;
    }

    public void writeList() throws IOException, ArrayIndexOutOfBoundsException {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        for (int i = 0; i < SIZE; i++) {
            out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();
    }

    public String getParsedPhoneNumber(String phoneNumber) throws Exception {
        if (phoneNumber.length() != 13) {
            throw new IllegalArgumentException("Phone Number는 13자리여야합니다.");
        }

        if (!phoneNumber.startsWith("010")) {
            throw new Exception("Phone Number는 010으로 시작해야합니다!");
        }

        String parsed = null;

        // Parse Phone number...
        return parsed;
    }
}
