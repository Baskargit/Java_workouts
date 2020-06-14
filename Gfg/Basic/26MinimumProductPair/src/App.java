import java.util.Arrays;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/minimum-product-pair/0/
// Execution Time:1.07

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
        int testcasecount = sc.nextInt();
        		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            
            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) 
            {
                array[i] = sc.nextInt();    
            }

            Arrays.sort(array);

            System.out.println(array[0] * array[1]);
		}
		
		sc.close();
    }
}
