package app;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            
            int array[] = new int[n*n];

            for (int i = 0; i < array.length; i++) 
            {
                array[i] = sc.nextInt();    
            }

            Arrays.sort(array);
            
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
        
        sc.close();
    }
}