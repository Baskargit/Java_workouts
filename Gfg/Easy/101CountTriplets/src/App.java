import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/count-the-triplets/0
// Execution Time:0.57

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
            HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);
                hashMap.put(numbers[i], 1);
            }

            int counter = 0;
            for (int i = 0; i < n; i++) 
            {
                for (int j = i + 1; j < n; j++) 
                { 
                    counter += (hashMap.containsKey(numbers[i] + numbers[j])) ? 1 : 0;
                }    
            }

            System.out.println(counter != 0 ? counter : -1);
		}
		
		bi.close();
    }
}
