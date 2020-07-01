import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/sum-equals-to-sum/0
// Execution Time:2.1

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int numbers[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);    
            }

            HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

            boolean isFound = false;

            for (int i = 0; i < n; i++) 
            {
                for (int j = i + 1; j < n; j++) 
                {
                    int key = numbers[i] + numbers[j];
                    String value = (numbers[i] > numbers[j]) ? numbers[i] + "" + numbers[j] : numbers[j] + "" + numbers[i]; 

                    if (hashMap.containsKey(key) && !hashMap.get(key).equals(value)) 
                    {
                        isFound = true;
                        i = n;
                        break;
                    }
                    else
                    {
                        hashMap.put(key, value);
                    }
                }    
            }

            System.out.println(isFound ? 1 : 0);
		}
		
		bi.close();
    }
}
