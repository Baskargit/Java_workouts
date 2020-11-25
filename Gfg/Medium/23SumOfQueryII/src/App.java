// https://practice.geeksforgeeks.org/problems/sum-of-query-ii/0/?difficulty[]=1&page=2&query=difficulty[]1page2
// Execution Time:0.46

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            int array[] = new int[n];

            String inputString[] = bi.readLine().split(" ");

            HashMap<Integer,Long> hashMap = new HashMap<Integer,Long>();

            long sum = 0;
            for (int i = 0; i < inputString.length; i++) 
            {
                array[i] = Integer.parseInt(inputString[i]);
                sum += array[i];
                hashMap.put(i+1, sum); 
            }

            StringBuilder output = new StringBuilder();

            int queryCount = 2 * (Integer.parseInt(bi.readLine().trim()));

            String queryArray[] = bi.readLine().split(" ");

            for (int i = 0; i < queryCount; i += 2) 
            {
                int l = Integer.parseInt(queryArray[i]);
                int r = Integer.parseInt(queryArray[i+1]);

                if (l != 1) 
                {
                    output.append(hashMap.get(r) - hashMap.get(l - 1) + " ");
                }
                else
                {
                    output.append(hashMap.get(r) + " ");
                }
            }

            System.out.println(output.toString());
		}
		
		bi.close();
    }
}
