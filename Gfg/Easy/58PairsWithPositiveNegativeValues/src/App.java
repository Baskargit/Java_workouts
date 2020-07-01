import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/pairs-with-positive-negative-values/0/
// Execution Time:0.51

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

            StringBuilder stringBuilder = new StringBuilder();

            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) 
            {
                int key = Math.abs(Integer.parseInt(string[i]));
                
                if (hashMap.containsKey(key))
                {
                    arrayList.add(key);
                }
                else
                {
                    hashMap.put(key, 1);
                }
            }

            Collections.sort(arrayList);

            for (Integer key : arrayList) 
            {
                stringBuilder.append(" -" + key + " " + key);
            }

            System.out.println(stringBuilder.length() == 0 ? 0 : stringBuilder.toString().trim());
		}
		
		bi.close();
    }
}
