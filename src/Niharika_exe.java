import java.io.*;

public class Niharika_exe
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String yourChat;
        int c, flag = 0;
        int count = 0;
        int[] storage = new int[50];

        do {
            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tYOU : ");
            yourChat = in.readLine();

            if(yourChat.equalsIgnoreCase(""))
                flag = 1;

            if(yourChat.equalsIgnoreCase("bye"))
                flag = 2;

            if(flag == 0)
            {
                System.out.print("\n\t\t\t\tNIHARIKA : ");

                c = (int) (Math.random()*(8-1)) + 1;

                storage[count] = c;

                if(count>2 && (c>5 || c<1) && (c==storage[count-1] ||  c==storage[count-2]))
                    c--;
                if(count>2 && c<=5 && (c==storage[count-1] ||  c==storage[count-2]))
                    c++;

                switch (c) {
                    case 1 -> System.out.print(" lmao");
                    case 2 -> System.out.print(" demn");
                    case 3 -> System.out.print(" tf");
                    case 4 -> System.out.print(" ;-;");
                    case 5 -> System.out.print(" huh");
                    case 6 -> System.out.println(" ifkr");
                    default -> System.out.print(" mala khoop irritate hotay");

                    // System.out.print(" मला खूप irritate होतंय ");
                }

            }

            if(flag == 2)
                System.out.print("\n\t\t\t\tNIHARIKA : bye");

            count++;

        }while (flag == 0);

    }
}
