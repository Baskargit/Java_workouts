import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/doubling-the-value/0/
// Execution Time:0.17

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String nb[] = bi.readLine().trim().split(" ");
            int n = Integer.parseInt(nb[0]);
            long b = Long.parseLong(nb[1]);

            String array[] = bi.readLine().trim().split(" ");

            for (int i = 0; i < n; i++) 
            {
                long number = Long.parseLong(array[i]);

                if (number == b) {
                    b += b;
                }
            }

            System.out.println(b);
		}
		
		bi.close();
    }
}
