import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/subarray-with-0-sum/0
// Execution Time:0.16

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int sum = 0;
            HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

            for (int i = 0; i < n; i++) 
            {
                int num = Integer.parseInt(string[i]);

                sum += num;
                int value = hashMap.getOrDefault(sum, 0) + 1;
                hashMap.put(sum, value);

                if (num == 0 || sum == 0 || value > 1) 
                { 
                    sum = 0; 
                    break; 
                }
            }

            System.out.println(sum == 0 ? "Yes" : "No");
		}
		
		bi.close();
    }
}

/**
Input:
34
36 27 -35 43 -15 36 42 -1 -29 12 -23 40 9 13 -24 -10 -24 22 -14 -39 18 17 -21 32 -20 12 -27 17 -15 -21 -48 -28 8 19

Its Correct output is:
Yes

And Your Code's output is:
No

 */
