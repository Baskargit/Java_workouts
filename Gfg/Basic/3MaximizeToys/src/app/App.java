package app;

import java.util.Arrays;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/maximize-toys/0/

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int toyCount = sc.nextInt();
            int amount = sc.nextInt();
            
            int toys[] = new int[toyCount];
            
            // Get datas
            for (int i = 0; i < toyCount; i++) 
            {
                int toyPrice = sc.nextInt();
                toys[i] = toyPrice;
            }

            // Sort buyableToys
            Arrays.sort(toys);

            int maxBuyable = 0,temp = 0;
            for (int i = 0; i < toyCount; i++)
            {
                if (temp + toys[i] <= amount) 
                {
                    maxBuyable++;
                    temp += toys[i];
                }
                else {
                    break;
                }
            }

            System.out.println(maxBuyable);
        }
        
        sc.close();
    }
}