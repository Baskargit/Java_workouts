import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array/0
// Execution Time:0.86

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine());
            
            String string[] = bi.readLine().trim().split(" ");

            int maxElement = 0;

            for (int i = 0; i < n; i++) 
            {
                int num = Integer.parseInt(string[i]);
                
                maxElement = (num > maxElement) ? num : maxElement;
            }

            System.out.println(maxElement);
		}
		
		bi.close();
    }
}
