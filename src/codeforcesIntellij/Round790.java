package codeforcesIntellij;

import java.io.*;

public class Round790
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(in.readLine());

        do
        {
            String s[] = new String[1];
            s = in.readLine().split("");

            int sumFirst = 0, sumLast = 0;

            sumFirst = Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + Integer.parseInt(s[2]);

            sumLast = Integer.parseInt(s[3]) + Integer.parseInt(s[4]) + Integer.parseInt(s[5]);

            System.out.println( ( sumFirst == sumLast ) ? "Yes" : "No" );

            tc--;
        }while (tc!=0);
    }
}
