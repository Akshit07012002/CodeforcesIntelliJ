package codeforcesIntellij;

import java.io.*;

public class VasyaHipster {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String[] s = new String[1];
        s = in.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int samePair = 0;
        int min = Math.min(a,b);

        if(min>0) {
            int diff = Math.max(a, b) - min;
            samePair = (diff>1) ? diff / 2 : 0 ;
        }

        System.out.println(min + " " + samePair);
    }

}
