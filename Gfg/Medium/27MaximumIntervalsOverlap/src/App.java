// https://practice.geeksforgeeks.org/problems/maximum-intervals-overlap/0/?difficulty[]=1#
// Execution Time:1.54

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
            int entryCount = Integer.parseInt(bi.readLine().trim());
            
            String entry[] = bi.readLine().trim().split(" ");
            String exit[] = bi.readLine().trim().split(" ");

            int entryTime[] = new int[entryCount];
            int exitTime[] = new int[entryCount];

            HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

            int max = 0;

            for (int i = 0; i < entryCount; i++) 
            {
                entryTime[i] = Integer.parseInt(entry[i]);
                exitTime[i] = Integer.parseInt(exit[i]);

                hashMap.put(entryTime[i], 1);

                max = (entryTime[i] > max || exitTime[i] > max) 
                    ? (entryTime[i] > max) ? entryTime[i] : (exitTime[i] > max) ? exitTime[i] : max
                    : max;
            }

            int overlap[] = new int[max + 1];

            for (int i = 0; i < entryCount; i++) 
            {
                for (int j = entryTime[i] - 1; j < exitTime[i]; j++) 
                {
                    overlap[j]++;
                }    
            }

            int maxGuest = 0;
            int overlapEntryTime = 0;

            for (int i = 0; i < overlap.length; i++) 
            {
                maxGuest = (overlap[i] > maxGuest) ? overlap[i] : maxGuest;
                overlapEntryTime = (hashMap.containsKey(i+1) && overlap[i] == maxGuest) ? i+1 : overlapEntryTime ; 
            }
            
            System.out.println(maxGuest + " " + overlapEntryTime);
		}
		
		bi.close();
    }
}
