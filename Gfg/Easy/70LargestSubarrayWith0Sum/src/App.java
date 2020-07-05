import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1/
// Expected Time Limit < 3.736sec
// Functional problem

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());

            String string[] = bi.readLine().trim().split(" ");

            int numbers[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);    
            }

            System.out.println(maxLen(numbers, n));
        }
    }

    // Old function
    public static int maxLen(int arr[], int n)
    {
        int maxLength = 0;

        int temArray[] = new int[n];

        for (int i = 0; i < n; i++) 
        {
            temArray[i] = arr[i];

            for (int j = 0; j < i; j++) 
            {
                temArray[j] += arr[i];

                if (temArray[j] == 0) 
                {
                    int len = (i - j) + 1;
                    maxLength = (len > maxLength) ? len : maxLength;    
                }
            }
        }

        return maxLength;
    }

}
