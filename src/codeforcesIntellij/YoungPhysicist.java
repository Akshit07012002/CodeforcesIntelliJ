package codeforcesIntellij;

import java.io.*;

public class YoungPhysicist {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] s = new String[1];

        int t = Integer.parseInt(in.readLine());

        int a = 0, b = 0, c = 0;

        while(t!=0){

            s = in.readLine().split(" ");

            a += Integer.parseInt(s[0]);
            b += Integer.parseInt(s[1]);
            c += Integer.parseInt(s[2]);

            t--;
        }

        if(a==0 && b==0 && c==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
