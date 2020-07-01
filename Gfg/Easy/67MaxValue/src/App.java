import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/max-value/0
// Execution Time:0.17

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int numbers[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);    
            }

            int maxSoFar = 0;

            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    if (i != j) 
                    {
                        int r = (numbers[i] - i) - (numbers[j] - j);
                        maxSoFar = (r > maxSoFar) ? r : maxSoFar;  
                    }   
                }    
            }

            System.out.println(maxSoFar);
		}
		
		bi.close();
    }
}

/**

Input:
35
760 394 549 274 793 194 934 138 104 691 212 695 669 628 499 990 249 880 648 150 932 670 876 599 450 437 600 124 444 732 155 862 435 386 968

Its Correct output is:
879

And Your Code's output is:
878

 */
