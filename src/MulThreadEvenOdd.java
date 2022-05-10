class PrintEvenOdd {

    int cnt = 1;
    static int N = 10;

    public void printOddNumber()
    {
        while(cnt < N)
        {
            while(cnt % 2 == 1){

                System.out.println("\tOdd  : " + cnt);
                cnt++;
            }
        }
    }

    public void printEvenNumber()
    {
        while(cnt < N)
        {
            while(cnt % 2 == 0){

                System.out.println("\tEven : " + cnt);
                cnt++;
            }
        }
    }


}
public class MulThreadEvenOdd {

    public static void main(String[] args) {
        PrintEvenOdd p = new PrintEvenOdd();
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                p.printEvenNumber();
            }
        });

        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                p.printOddNumber();
            }
        });

        t1.start();
//	try
//	{
//		t1.join();
//	}
//	catch (InterruptedException e)
//	{
//		e.printStackTrace();
//	}
        t2.start();

    }

}
