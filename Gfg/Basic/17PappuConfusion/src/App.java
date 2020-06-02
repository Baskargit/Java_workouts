import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            long n = sc.nextInt();
            long originalN = n;
            
            long possibleMax = 0;
            long multiplier = 1;

            while (n > 0) 
            {
                if (n % 10 == 6) 
                {
                    possibleMax += (9) * multiplier;    
                }
                else
                {
                    possibleMax += (n % 10) * multiplier;
                }

                multiplier *= 10;
                n /= 10;
            }

            System.out.println((possibleMax > originalN) ? possibleMax - originalN: 0);
        }
        
        sc.close();
    }
}
