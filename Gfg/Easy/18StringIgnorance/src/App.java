import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/string-ignorance/0
// Execution Time:0.3

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char array[] = bi.readLine().toCharArray();
            
            HashMap<Character,Boolean> hashMap = new HashMap<Character,Boolean>();

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < array.length; i++) 
            {
                char ch = Character.toLowerCase(array[i]);

                if (hashMap.containsKey(ch)) 
                {
                    if (hashMap.get(ch)) 
                    {
                        hashMap.replace(ch, false);
                    }
                    else
                    {
                        stringBuilder.append(array[i]);
                        hashMap.replace(ch, true);
                    }
                }
                else
                {
                    hashMap.put(ch, true);
                    stringBuilder.append(array[i]);
                }    
            }

            System.out.println(stringBuilder.toString());
		}
		
		bi.close();
    }
}
