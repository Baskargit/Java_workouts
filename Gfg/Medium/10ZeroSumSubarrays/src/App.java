import java.util.HashMap;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/zero-sum-subarrays/0
// Execution Time:5.95

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
		
		int testcasecount = scanner.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = scanner.nextInt();
            
            long sum = 0;
            int zeroCount = 0;
            HashMap<Long,Integer> hashMap = new HashMap<Long,Integer>();
            hashMap.put((long)0, 1);

            for (int i = 0; i < n; i++) 
            {
                sum += scanner.nextLong();

                if (hashMap.containsKey(sum)) 
                {
                    zeroCount += hashMap.get(sum);
                    hashMap.replace(sum, hashMap.get(sum) + 1);
                }
                else
                {
                    hashMap.put(sum, 1);
                }
            }

            System.out.println(zeroCount);
		}
		
		scanner.close();
    }
}

/**
I/P
10
6 -1 -3 4 -2 2 4 6 -12 -7

O/P
4
 */