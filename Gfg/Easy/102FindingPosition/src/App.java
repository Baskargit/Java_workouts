import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/finding-position/0
// Execution Time:0.22

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            int pos = 1;

            if (n > 1) 
            {
                for (int i = 1; i <= n; i++) 
                {
                    int val = (int)Math.pow(2, i);

                    if (val >= n) 
                    {
                        pos = (val == n) ? n : (int)Math.pow(2, i - 1);
                        break;
                    }
                }
            }
            
            System.out.println(pos);
		}
		
		bi.close();
    }
}
