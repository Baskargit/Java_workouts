import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/minimum-energy/0
// Execution Time:0.33

// Faced number format exception so changed to Scanner

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner bi = new Scanner(System.in);
		
		int testcasecount = bi.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = bi.nextInt();
            
            int minimumEnergy = 1,sum = 0;

            for (int i = 0; i < n; i++) 
            {
                int num = bi.nextInt();

                sum += num;

                if (sum <= 0) 
                {
                    minimumEnergy += Math.abs(sum);
                    sum += Math.abs(sum) + 1;
                }
            }

            System.out.println(minimumEnergy);
		}
		
		bi.close();
    }
}
