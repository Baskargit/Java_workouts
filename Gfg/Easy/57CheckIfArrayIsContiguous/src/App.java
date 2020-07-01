import java.util.HashMap;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/check-if-array-contains-contiguous-integers-with-duplicates-allowed/0
// Execution Time:0.5

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner bi = new Scanner(System.in);
		
		int testcasecount = bi.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = bi.nextInt();
            
            HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
            long totalSum = 0;
            int minValue = Integer.MAX_VALUE,maxValue = 0;

            for (int i = 0; i < n; i++)
            {
                int key = bi.nextInt();

                if (!hashMap.containsKey(key)) 
                {
                    hashMap.put(key, 1);

                    minValue = (key < minValue) ? key : minValue;
                    maxValue = (key > maxValue) ? key : maxValue;

                    totalSum += key;
                }
            }

            long tempSum = 0;
            for (int i = minValue; i <= maxValue; i++) 
            {
                tempSum += i;
            }

            System.out.println((totalSum == tempSum) ? "Yes" : "No");
		}
		
		bi.close();
    }
}
