import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/trapping-rain-water/0/
// Unsolved

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            String input[] = bi.readLine().trim().split(" ");

            long trappedWater = 0,previousMax = -1;
            for (int i = 0; i < n; i++) 
            {
                int number = Integer.parseInt(input[i]);

                if (number > previousMax) 
                {
                    previousMax = number;
                } 
                else 
                {
                    trappedWater += previousMax - number;
                }
            }

            System.out.println(trappedWater);
		}
		
		bi.close();
    }
}
