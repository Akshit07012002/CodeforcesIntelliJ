package codeforcesIntellij;

import java.io.*;

public class Playoff
{
    public static void main(String []args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(in.readLine());

        do
        {
            int n = Integer.parseInt(in.readLine());

            System.out.println((int)Math.pow(2,n) - 1);

            tc--;
        }while (tc!=0);
    }
}
