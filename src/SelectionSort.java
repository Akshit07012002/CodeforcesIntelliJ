import java.io.*;

public class SelectionSort
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\t\tSELECTION SORT");

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
            int min = i;
            for (int j = i+1; j < n; j++)
            {
                if(a[min] > a[j])
                {
                    int temp = a[min];
                    a[min] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array : ");

        for (int i = 0; i < n-1; i++)
            System.out.print(a[i] + ", ");

        System.out.println(a[n-1]);

    }
}
