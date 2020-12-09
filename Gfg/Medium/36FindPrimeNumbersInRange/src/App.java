import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range/0/?difficulty[]=1&page=2&query=difficulty[]1page2#
// Execution Time:0.21

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String numbers[] = bi.readLine().split(" ");
            
            int m = Integer.parseInt(numbers[0]);
            int n = Integer.parseInt(numbers[1]);

            m = (m == 1) ? 2 : m;
            n = (n == 1) ? 2 : n;

            StringBuilder output = new StringBuilder();

            for (int i = m; i <= n; i++) 
            {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) 
                {
                    if (i % j == 0) 
                    {
                        isPrime = false;
                        break;
                    }    
                }
                
                if (isPrime) 
                {
                    output.append(i + " ");
                }
            }

            System.out.println(output.toString());

		}
		
		bi.close();
    }
}
