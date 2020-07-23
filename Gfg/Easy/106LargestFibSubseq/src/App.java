import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/largest-fibonacci-subsequence/0
// Execution Time:0.24

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
        int testcasecount = Integer.parseInt(bi.readLine());
        
        HashMap<Long,Integer> hashMap = new HashMap<Long,Integer>();
        hashMap.put((long)0, 1);
        hashMap.put((long)1, 1);

        for (int i = 3; i <= 1000; i++) 
        {
            double phi = (1 + Math.sqrt(5)) / 2;
            long key = (long)Math.round(Math.pow(phi, i)/Math.sqrt(5));

            if (key <= 1000) {
                hashMap.put(key, 1);
            }
            else { break; }
        }
        
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String input[] = bi.readLine().trim().split(" ");

            StringBuilder output = new StringBuilder();

            for (int i = 0; i < input.length; i++) 
            {
                long key = Long.parseLong(input[i]);
                
                if (hashMap.containsKey(key)) {
                    output.append(key + " ");
                }
            }

            System.out.println(output);
		}
		
		bi.close();
    }
}
