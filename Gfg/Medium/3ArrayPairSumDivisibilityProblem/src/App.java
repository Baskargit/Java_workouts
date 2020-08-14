import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem/0/
// Unsolved

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

            boolean result = false;
            int pairCount = 0;

            if (n % 2 == 0) 
            {
                HashSet<Integer> hashSet = new HashSet<Integer>();

                for (int i = 0; i < string.length; i++) 
                {
                    int key = Integer.parseInt(string[i]);

                    if (hashSet.contains(key)) 
                    {
                        pairCount += ((key + key) % k == 0) ? 1 : 0;
                        hashSet.remove(key);
                    }
                    else
                    {
                        hashSet.add(key);
                    }
                }

                for (Integer key : hashSet) 
                {
                    int diff = key % k;
                    

                    if (hashSet.contains(diff + k)) 
                    {
                        result = true;
                        pairCount++;    
                    }
                }

            }

            System.out.println(result ? (pairCount == n) ? "True" : "False" : "False");
		}
		
		bi.close();
    }
}
