package app;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1/
// Execution time : Time limit exceeded

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();

            long array[] = new long[n];

            for (int i = 0; i < n; i++) 
            {
                array[i] = sc.nextLong();
            }

            long x = sc.nextLong();
            long y = sc.nextLong();

            System.out.println(minDist(array, n, x, y));
        }

        sc.close();
    }

    public static long minDist(long arr[], long n, long x, long y) 
    {
        long minDistance = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (((x == arr[i] && y == arr[j]) || (x == arr[j] && y == arr[i])) && minDistance > Math.abs(i - j)) 
                {
                    minDistance = Math.abs(i - j);              
                }
            }
        }

        return (minDistance == Long.MAX_VALUE) ? -1 : minDistance;
    }
}