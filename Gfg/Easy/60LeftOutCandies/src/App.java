import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/left-out-candies/0
// Execution Time:0.23

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner bi = new Scanner(System.in);
		
		int testcasecount = bi.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = bi.nextInt();
            int m = bi.nextInt();

            int leftOutCandies = m;
            int val = 0;

            for (int i = 1; true; i++) 
            {
                val = leftOutCandies - i;

                if (i < n) 
                {
                    if (val > 0) 
                    {
                        leftOutCandies = val;
                    }
                    else
                    {
                        leftOutCandies = (val == 0) ? 0 : leftOutCandies;
                        break;
                    }
                }
                else
                {
                    if (val > 0) 
                    {
                        leftOutCandies = val;
                        i = 0;
                    }
                    else
                    {
                        leftOutCandies = (val == 0) ? 0 : leftOutCandies;
                        break;
                    }
                }
            }

            System.out.println(leftOutCandies);
		}
		
		bi.close();
    }
}
