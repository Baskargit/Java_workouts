import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/rearrange-a-string/0/
// Execution Time:0.33

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char input[] = bi.readLine().trim().toCharArray();
            
            TreeMap<Character,Integer> hashMap = new TreeMap<Character,Integer>();
            long sum = 0;

            for (int i = 0; i < input.length; i++) 
            {
                if (Character.isDigit(input[i])) 
                {
                    sum += Long.parseLong(input[i] + "");
                }
                else
                {
                    if (hashMap.containsKey(input[i])) 
                    {
                        hashMap.put(input[i], hashMap.get(input[i]) + 1);
                    }
                    else
                    {
                        hashMap.put(input[i], 1);
                    }
                }
            }

            StringBuilder output = new StringBuilder();

            for (Map.Entry<Character,Integer> map : hashMap.entrySet()) 
            {
                if (map.getValue() > 1) 
                {
                    char key = map.getKey();
                    int value = map.getValue();

                    for (int i = 0; i < value; i++) 
                    {
                        output.append(key);
                    }
                }
                else
                {
                    output.append(map.getKey());
                }
            }

            System.out.println(output + "" + sum);
		}
		
		bi.close();
    }
}

/**
Input:
DORWBL4A16H1

Its Correct output is:
ABDHLORW12

And Your Code's output is:
ARBDWHLO12
 */