import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/first-repeating-element/0
// Execution Time:1.24

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
            int firstMinKey = -1;
            int firstMinIndex = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) 
            {
                int key = Integer.parseInt(string[i]);
                
                if (hashMap.containsKey(key)) 
                {
                    int index = hashMap.get(key);

                    if (index < firstMinIndex) 
                    {
                        firstMinIndex = index;
                        firstMinKey = key; 
                    }
                }
                else
                {
                    hashMap.put(key, i);
                }
            }

            System.out.println((firstMinIndex == Integer.MAX_VALUE) ? -1 : hashMap.get(firstMinKey) + 1);
		}
		
		bi.close();
    }
}
