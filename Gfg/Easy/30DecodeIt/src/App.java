import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

// https://practice.geeksforgeeks.org/problems/decode-it/0
// Unable to understand the question

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String inputString = bi.readLine();
            int k = Integer.parseInt(bi.readLine());

            LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<String,Integer>();

            int prevPos = 0;

            for (int i = 0; i < inputString.length(); i++) 
            {
                if (Character.isDigit(inputString.charAt(i))) 
                {
                    String key = inputString.substring(prevPos, i);
                    
                    int value = Integer.parseInt(Character.toString(inputString.charAt(i)));

                    hashMap.put(key, value);

                    prevPos = i + 1;
                }    
            }

            StringBuilder stringBuilder = new StringBuilder();
            
            for (int i = 0; i < ; i++) 
            {
                
            }

            System.out.println();
		}
		
		bi.close();
    }
}
