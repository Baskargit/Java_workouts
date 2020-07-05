import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/kth-distance/0
// Execution Time:1.31

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String kn[] = bi.readLine().trim().split(" ");
            int k = Integer.parseInt(kn[0]);
            int n = Integer.parseInt(kn[1]);
            
            String string[] = bi.readLine().trim().split(" ");

            HashMap<Integer,LinkedList<Integer>> hashMap = new HashMap<Integer,LinkedList<Integer>>();
            
            for (int i = 0; i < n; i++) 
            {
                int key = Integer.parseInt(string[i]);

                if (hashMap.containsKey(key)) 
                {
                    LinkedList<Integer> value = hashMap.get(key);
                    value.add(i);

                    hashMap.replace(key, value);
                }
                else
                {
                    LinkedList<Integer> value = new LinkedList<Integer>();
                    value.add(i);
                    hashMap.put(key,value);
                }
            }

            boolean isFound = false;

            for (Map.Entry<Integer,LinkedList<Integer>> entry : hashMap.entrySet()) 
            {
                if (entry.getValue().size() > 1) 
                {
                    boolean canProceed = true;
                    
                    int prev = -1;
                    for (Integer value : entry.getValue()) 
                    {
                        if (prev == -1) 
                        {
                            prev = value.intValue();    
                        }
                        else
                        {
                            if (value.intValue() - prev <= k) 
                            {
                                isFound = true;
                                canProceed = false;
                                break;
                            }
                        }

                        prev = value.intValue();
                    }

                    if (!canProceed) {
                        break;
                    }
                }
            }

            System.out.println(isFound ? "True" : "False");
		}
		
		bi.close();
    }
}
