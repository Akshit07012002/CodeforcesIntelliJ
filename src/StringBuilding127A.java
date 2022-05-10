import java.io.*;

public class StringBuilding127A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(in.readLine());

        do {
            String s[] = new String[1];
            s = in.readLine().split("");
            int c = 0, flag = 0;

            for(int i=0; i<s.length; i++)
            {
                if(s[i].equalsIgnoreCase(s[i+1]))
                    c++;
                if(!(s[i].equalsIgnoreCase(s[i+1])))
                {
                    c=0;
                    flag = 1; break;
                }
            }

            if(flag == 1)
                System.out.println("NO");
            else
                System.out.println("YES");

            tc--;
        }while(tc!=0);

    }
}
