import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/majority-element/0/
// Execution Time:0.93

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
            
            String key = "-1";
            int minOccurence = n/2;

            for (int i = 0; i < n; i++) 
            {
                if (hashMap.containsKey(array[i])) 
                {
                    int value = hashMap.get(array[i]) + 1;

                    hashMap.replace(array[i], value);

                    if (value > minOccurence) 
                    {
                        key = new String(array[i]);
                    }
                }
                else
                {
                    hashMap.put(array[i], 1);
                }
            }

            System.out.println(key);
		}
		
		bi.close();
    }
}
