import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/facing-the-sun/0
// Execution Time:0.67

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int maxHeight = 0,count = 0;
            for (int i = 0; i < n; i++) 
            {
                int height = Integer.parseInt(string[i]);

                if (height > maxHeight) 
                {
                    maxHeight = height;
                    count++;
                }
            }

            System.out.println(count);
		}
		
		bi.close();
    }
}
