import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/single-number/0
// Execution Time:0.96

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

            for (int i = 0; i < n; i++) 
            {
                int key = Integer.parseInt(string[i]);

                if (hashMap.containsKey(key)) {
                    hashMap.replace(key, hashMap.get(key) + 1);
                }
                else
                {
                    hashMap.put(key, 1);
                }
            }

            int num = 0;

            for (Map.Entry<Integer,Integer> entry: hashMap.entrySet()) 
            {
                if (entry.getValue() % 2 != 0) 
                {
                    num = entry.getKey();    
                }    
            }

            System.out.println(num);
		}
		
		bi.close();
    }
}
