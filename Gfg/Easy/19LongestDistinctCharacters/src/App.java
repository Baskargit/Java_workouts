import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

// https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string/0
// Execution Time:0.2

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char array[] = bi.readLine().toCharArray();
            
            LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<Character,Integer>();

            int maxSubStringLength = 0;

            for (int i = 0; i < array.length; i++) 
            {
                hashMap.put(array[i], 1);

                for (int j = i+1; j < array.length; j++) 
                {
                    if (hashMap.containsKey(array[j])) 
                    {
                        maxSubStringLength = (hashMap.size() > maxSubStringLength) ? hashMap.size() : maxSubStringLength;
                        hashMap.clear();
                        break;
                    }
                    else
                    {
                        hashMap.put(array[j], 1);
                    }
                }
            }

            System.out.println(maxSubStringLength);
		}
		
		bi.close();
    }
}

/**
Input:
aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv

Its Correct output is:
10

And Your Code's output is:
11
 */