package codeforcesIntellij;

import java.io.*;


public class Round790B
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(in.readLine());

        do
        {
            int n = Integer.parseInt(in.readLine());

            long total = 0L;

            String s[] = new String[1];
            s = in.readLine().split(" ");

            long min = 999999;

            if(n > 1)
            {
                for (int i = 0; i < n; i++)
                    if(Long.parseLong(s[i]) < min)
                        min = Long.parseLong(s[i]);

                for (int i = 0; i < n; i++)
                {
                    if(Long.parseLong(s[i]) != min)
                    {
                        total += Long.parseLong(s[i]) - min;
                    }
                }
            }


            System.out.println( total );

            tc--;
        }while (tc!=0);
    }
}