package app;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

// https://practice.geeksforgeeks.org/problems/remove-duplicates-from-unsorted-array/0/
// Execution time : 0.31s

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();

            Set<Integer> set = new LinkedHashSet<Integer>();

            for (int i = 0; i < n; i++) 
            {
                set.add(sc.nextInt());
            }

            Integer array[] =  set.toArray(new Integer[0]);

            for (int i = 0; i < array.length; i++) 
            {
                System.out.print(array[i] + " ");
            }

            System.out.println();
        }
        
        sc.close();
    }
}