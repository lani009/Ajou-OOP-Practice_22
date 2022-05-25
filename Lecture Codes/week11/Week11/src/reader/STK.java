package reader;

import java.util.StringTokenizer;

public class STK {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("1 2 5 3 4 8");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }


        String[] tok = "1 2 5 3 4 8".split(" ");
        for (String string : tok) {
            System.out.print(string);
        }
    }
}
