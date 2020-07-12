import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/pairs-with-difference-k/0
// Runtime exception ==> Input issue

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

        int testcasecount = Integer.parseInt(bi.readLine().trim());

        while(testcasecount-- > 0)
		{
            String nk[] = bi.readLine().trim().split("\\s+");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String string[] = bi.readLine().trim().split("\\s+");

            int numbers[] = new int[n];

            for (int i = 0; i < n; i++)
            {
                numbers[i] = Integer.parseInt(string[i]);   
            }

            int pairCount = 0;
            
            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    if (Math.abs(numbers[i] - numbers[j]) == k) {
                        pairCount++;
                    }    
                }    
            }

            System.out.println(pairCount);
        }

        bi.close();
    }
}
