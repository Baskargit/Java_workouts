import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k/0/?difficulty[]=1&page=3&query=difficulty[]1page3#
// Execution Time:0.57

// Expected Time Complexity: O(n) => met
// Expected Space Complexity: O(n) => met

public class App
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String nk[] = bi.readLine().trim().split(" ");
            
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String string[] = bi.readLine().trim().split(" ");
            int array[] = new int[n];

            for (int i = 0; i < array.length; i++) 
            {
                array[i] = Integer.parseInt(string[i]);
            }

            int length = HashMapApproach(array, k);
            
            System.out.println(length);
		}
		
		bi.close();
    }

    // O(n) approach
    public static int HashMapApproach(int array[],int k)
    {
        int maxLength = 0;

        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        int sum = 0;

        for (int i = 0; i < array.length; i++) 
        {
            sum += array[i];

            if (sum == k) 
            {
                maxLength = i + 1;
            }

            if (!hashMap.containsKey(sum)) 
            {
                hashMap.put(sum,i);
            }

            if (hashMap.containsKey(sum - k)) 
            {
                int length = i - hashMap.get(sum - k);
                maxLength = (length > maxLength)? length : maxLength;
            }
        }

        return maxLength;
    }

    // O(n2)
    public static int BruteforceApproach(int array[],int k)
    {
        int length = 0;

        for (int i = 0; i < array.length; i++) 
        {
            int tempSum = 0;

            for (int j = i; j < array.length; j++) 
            {
                tempSum += array[j];

                if (tempSum == k) 
                {
                    int tempLength = (j - i) + 1;
                    length = (tempLength > length) ? tempLength : length;
                }
            }    
        }

        return length;
    }
}
