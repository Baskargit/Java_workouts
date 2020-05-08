package app;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos/0/
// Execution Time:3.59

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            
            int postive[] = new int[n],postiveCount = 0;
            int negative[] = new int[n],negativeCount = 0;

            for (int i = 0; i < n; i++) 
            {
                int num = sc.nextInt();

                if (num >= 0) {
                    postive[postiveCount++] = num;
                } else {
                    negative[negativeCount++] = num;
                }
            }
            
            StringBuilder output = new StringBuilder();
            int i = 0, j = 0;
            while (true) 
            {
                if (i < postiveCount) {
                    output.append(postive[i++] + " ");
                }

                if (j < negativeCount) {
                    output.append(negative[j++] + " ");
                }

                if (i >= postiveCount && j >= negativeCount) {
                    break;
                }
            }

            System.out.println(output);
        }
        
        sc.close();
    }
}