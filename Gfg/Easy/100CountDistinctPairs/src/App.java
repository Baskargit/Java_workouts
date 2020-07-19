import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/count-distinct-pairs-with-difference-k/0
// Execution Time:0.29

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            String string[] = bi.readLine().trim().split(" ");
            int k = Integer.parseInt(bi.readLine().trim());

            int numbers[] = new int[n];
            
            HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
            
            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);
            }

            for (int i = 0; i < n; i++) 
            {
                for (int j = i + 1; j < n; j++) 
                {
                    int sum = Math.abs(numbers[i] - numbers[j]);

                    if (sum == k) 
                    {
                        String key = (numbers[i] <= numbers[j]) ? numbers[i] + " " + numbers[j] : numbers[j] + " " + numbers[i];
                        
                        if (!hashMap.containsKey(key)) 
                        {
                            hashMap.put(key, 1);
                        }
                    }
                }    
            }

            System.out.println(hashMap.size());
		}
		
		bi.close();
    }
}

/*
Input:
71
9095 6221 7845 2367 535 5227 5395 1364 8739 7845 9591 6551 5160 8624 4948 7386 7218 5273 5540 9248 2386 3497 4886 624 2421 8145 1969 5736 9916 1626 3535 6043 6012 4680 4153 5245 7296 8819 397 7693 1816 2992 34 2670 9398 9554 548 5826 1211 9663 212 3809 3378 2762 626 7336 1869 7996 2777 2768 7440 9875 9332 557 6302 8873 561 95 8985 3756 9790
39

Its Correct output is:
0

And Your Code's output is:
1
 */

 /**
Input:
20
5357 9462 8488 8354 3900 5789 4245 9881 2467 8284 5275 237 8910 8568 1835 7940 9685 9652 9550 9267
80

Its Correct output is:
1

And Your Code's output is:
0
  */
