import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/non-repeating-element/0
// Execution Time:1.14

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            LinkedHashMap<Long,Long> hashMap = new LinkedHashMap<Long,Long>();

            for (int i = 0; i < n; i++) 
            {
                long key = Long.parseLong(string[i]);

                if (hashMap.containsKey(key)) 
                {
                    hashMap.replace(key, hashMap.get(key) + 1);
                }
                else
                {
                    hashMap.put(key, (long)1);
                }
            }

            long nonRepeated = 0;
            for (Map.Entry<Long,Long> entry : hashMap.entrySet()) 
            {
                if (entry.getValue() == 1) 
                {
                    nonRepeated = entry.getKey();
                    break;    
                }    
            }

            System.out.println(nonRepeated);
		}
		
		bi.close();
    }
}
