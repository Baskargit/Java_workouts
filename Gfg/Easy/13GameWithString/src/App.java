import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/problems/game-with-string/0/
// Improper logic

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String inputString = bi.readLine();
            int k = Integer.parseInt(bi.readLine().trim());

            HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();

            for (int i = 0; i < inputString.length(); i++) 
            {
                char key = inputString.charAt(i);

                if (hashMap.containsKey(key)) 
                {
                    hashMap.replace(key, hashMap.get(key) + 1);
                }
                else
                {
                    hashMap.put(key, 1);
                }    
            }

            // Sort hashmap by key in  desc order
            List<Entry<Character,Integer>> list = new LinkedList<Entry<Character,Integer>>(hashMap.entrySet());

            Collections.sort(list,new Comparator<Entry<Character,Integer>>() 
            {
                @Override
                public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) 
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
            
            }.reversed());


            double minValue = 0;
            if (k > 0) 
            {
                if (k < inputString.length()) 
                {
                    for (Entry<Character,Integer> entry : list) 
                    {
                        if (k > 0) 
                        {
                            int tempVal = entry.getValue();

                            char key = entry.getKey();
                            int value = k - tempVal;

                            if (value >= 0) {
                                hashMap.replace(key, 0);
                            }
                            else
                            {
                                hashMap.replace(key, tempVal - k);
                            }

                            k -= tempVal;
                        }
                    }
                    
                    // Calculate Minvalue
                    for (Map.Entry<Character,Integer> entry : hashMap.entrySet()) 
                    {
                        minValue += Math.pow(entry.getValue(), 2);
                    }
                }
                
            }
            else
            {
                for (Map.Entry<Character,Integer> entry : hashMap.entrySet()) 
                {
                    minValue += Math.pow(entry.getValue(), 2);
                }
            }

            System.out.println((long)minValue);
		}
		
		bi.close();
    }
}

/**
2
fxnsmkasmlerxxoxhfwviluzttqqotdwrsqfcsxrddicaxahewemjyleudukxzgqrzvvrtmvwvxzuxiyvnngna
21
egsdhatazqwtlkokhllblvcikppyrbhvkbaretudmsyxcmjkyunlqptagiaymivwlwpprlvddtdggmsghhrxxkzfvadhkbfvxu
88
Your Output is:
9223372036854775807
9223372036854775807
 */

/**
Input:
fxnsmkasmlerxxoxhfwviluzttqqotdwrsqfcsxrddicaxahewemjyleudukxzgqrzvvrtmvwvxzuxiyvnngna
21

Its Correct output is:
185

And Your Code's output is:
261
 */