package app;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/anshumans-favourite-number/0

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            
            System.out.println((n % 5 == 0) ? "YES" : "NO");
        }
        
        sc.close();
    }
}