import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1/
// Execution Time:1.44
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
                
                if (numbers[i] == 0) 
                {
                    numbers[i] = -1;
                }
            }

            System.out.println(maxLen(numbers, numbers.length));
        }
    }

    // Old function
    public static int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        int maxLength = 0,sum = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            sum += arr[i];

            if (sum == 0) 
            {
                maxLength = i+1;    
            }
            else
            {
                if (hashMap.containsKey(sum)) 
                {
                    int prevLength = i - hashMap.get(sum);
                    maxLength = (prevLength > maxLength) ? prevLength : maxLength;
                }
                else
                {
                    hashMap.put(sum, i);
                }
            }
        }

        return maxLength;
    }

}
