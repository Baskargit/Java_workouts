import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/chocolate-station/0
// Execution Time:0.25

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
        
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());

            String string[] = bi.readLine().trim().split(" ");

            int chocolatePrice = Integer.parseInt(bi.readLine().trim());

            int chocolatesBought = Integer.parseInt(string[0]),chocolatesBalance = 0;
            int prevChocolateCount = chocolatesBought;

            for (int i = 1; i < n; i++) 
            {
                int noOfChocolates = Integer.parseInt(string[i]);

                int diff = prevChocolateCount - noOfChocolates;

                if (diff < 0) 
                {
                    if (chocolatesBalance > 0) 
                    {
                        int absDiff = Math.abs(diff);

                        if (chocolatesBalance - absDiff >= 0) 
                        {
                            chocolatesBalance -= absDiff;
                        }
                        else
                        {
                            diff = Math.abs(chocolatesBalance - absDiff);
                            chocolatesBalance = 0;
                            chocolatesBought += Math.abs(diff);
                        }
                    }
                    else
                    {
                        chocolatesBought += Math.abs(diff);
                    }
                }
                else
                {
                    chocolatesBalance += diff;
                }

                prevChocolateCount = noOfChocolates;
            }
            
            System.out.println(chocolatesBought * chocolatePrice);
		}
		
		bi.close();
    }
}
