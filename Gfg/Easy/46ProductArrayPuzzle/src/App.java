import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/product-array-puzzle/0
// Execution Time:0.62

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");
            
            int array[] = new int[n];
            long totalProduct = 1;

            for (int i = 0; i < n; i++) 
            {
                array[i] = Integer.parseInt(string[i]);
                totalProduct *= array[i];
            }

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < n; i++) 
            {
                stringBuilder.append(totalProduct/array[i] + " ");
            }

            System.out.println(stringBuilder.toString());
		}
		
		bi.close();
    }
}
