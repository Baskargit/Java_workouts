package app;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0
// Execution time : 3.23s

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            int rotateBy = sc.nextInt();

            int array[] = new int[n];

            StringBuilder output = new StringBuilder();

            for (int i = 0; i < n; i++) 
            {
                int num = sc.nextInt();

                if (i >= rotateBy) {
                    output.append(num + " ");
                }

                array[i] = num;
            }

            for (int i = 0; i < rotateBy; i++) {
                output.append(array[i] + " ");
            }

            System.out.println(output);
        }
        
        sc.close();
    }
}