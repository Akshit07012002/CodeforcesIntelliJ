import java.io.*;

public class BubbleSort
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\t\tBUBBLE SORT");

        System.out.print("Enter the length of array : ");
        int n = Integer.parseInt(in.readLine());

        int a[] = new int[n];

        System.out.println("Enter the array : ");

        for (int i = 0; i < n; i++)
        {
            System.out.print(" a[" + i + "] : ");
            a[i] = Integer.parseInt(in.readLine());
        }

        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted Array : ");

        for (int i = 0; i < n-1; i++)
            System.out.print(a[i] + ", ");

        System.out.println(a[n-1]);

    }
}
