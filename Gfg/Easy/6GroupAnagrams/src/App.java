import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/problems/k-anagrams-1/0
// Execution Time:0.29

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine());
            
            String array[] = bi.readLine().split(" ");

            HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

            for (int i = 0; i < n; i++) 
            {
                char ch[] = array[0].toCharArray();
                Arrays.sort(ch);

                String key = new String(ch);
                
                if (hashMap.containsKey(key)) 
                {
                    hashMap.replace(key, hashMap.get(key) + 1);    
                }
                else
                {
                    hashMap.put(key, 1);
                }
            }

            LinkedHashMap<String,Integer> reverseSortedMap = new LinkedHashMap<String,Integer>();
            
            hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())) 
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

            int count = reverseSortedMap.size();
            int counter = 0;

            for (Entry<String,Integer> entry : reverseSortedMap.entrySet()) 
            {
                ++counter;
                System.out.print(entry.getValue() + ((counter != count) ? " " : ""));
            }

            System.out.println();
		}
		
		bi.close();
    }
}

/**
Input:
10
llj gqf wtv kbo qzg jct aza icf lnb dlr

Its Correct output is:
1 1 1 1 1 1 1 1 1 1

And Your Code's output is:
1 1 1 1 1 2 3
 */
