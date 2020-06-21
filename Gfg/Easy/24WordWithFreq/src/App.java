import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/word-with-maximum-frequency/0
// Execution Time:0.28

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String array[] = bi.readLine().split(" ");
            
            LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<String,Integer>();

            int maxOccurenece = 0;
            String outputString = null;

            for (String string : array) 
            {
                if (hashMap.containsKey(string)) 
                {
                    hashMap.replace(string, hashMap.get(string) + 1);
                }
                else
                {
                    hashMap.put(string, 1);
                }
            }

            for (Map.Entry<String,Integer> entry : hashMap.entrySet()) 
            {
                if (entry.getValue() > maxOccurenece) {
                    maxOccurenece = entry.getValue();
                    outputString = entry.getKey();
                }    
            }

            System.out.println(outputString + " " + maxOccurenece);
		}
		
		bi.close();
    }
}
