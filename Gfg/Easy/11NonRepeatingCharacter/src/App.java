import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

// https://practice.geeksforgeeks.org/problems/non-repeating-character/0
// Execution Time:0.88

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String dummy = bi.readLine();
            
            char input[] = bi.readLine().toCharArray();

            LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<Character,Integer>();
            LinkedHashMap<Character,Integer> linkedHashMapFinal = new LinkedHashMap<Character,Integer>();
            for (int i = 0; i < input.length; i++) 
            {
                if (linkedHashMap.containsKey(input[i])) {
                    linkedHashMap.replace(input[i], 2);
                    linkedHashMapFinal.remove(input[i]);
                }
                else {
                    linkedHashMap.put(input[i], 1);
                    linkedHashMapFinal.put(input[i], 1);
                }
            }

            if (!linkedHashMapFinal.isEmpty()) 
            {
                System.out.println(linkedHashMapFinal.entrySet().iterator().next().getKey());    
            }
            else
            {
                System.out.println(-1);
            }
		}
		
		bi.close();
    }
}
