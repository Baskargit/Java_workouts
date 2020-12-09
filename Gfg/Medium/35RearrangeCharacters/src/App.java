import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/rearrange-characters/0/?difficulty[]=1&page=2&query=difficulty[]1page2#
// Execution Time:0.51

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String input = bi.readLine();
            
            HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();

            for (int i = 0; i < input.length(); i++) 
            {
                char key = input.charAt(i);

                if (hashMap.containsKey(key)) 
                {
                    hashMap.put(key, hashMap.get(key) + 1);
                }
                else
                {
                    hashMap.put(key, 1);
                }
            }

            boolean isPossible = true;

            if (input.length() > 1) 
            {
                StringBuilder outputString = new StringBuilder();

                while (hashMap.size() > 1) 
                {
                    Iterator<Map.Entry<Character,Integer>> iterator = hashMap.entrySet().iterator();

                    while (iterator.hasNext()) 
                    {
                        Map.Entry<Character,Integer> entry = iterator.next();

                        outputString.append((char)entry.getKey());

                        if (entry.getValue() == 1) 
                        {
                            iterator.remove();
                        }
                        else
                        {
                            hashMap.replace(entry.getKey(), entry.getValue() - 1);
                        }
                    }
                }

                if (hashMap.size() == 1) 
                {
                    char key = hashMap.entrySet().iterator().next().getKey();
                    int value = hashMap.entrySet().iterator().next().getValue();

                    for (int i = 0; i < value; i++) 
                    {
                        boolean proceed = false;

                        for (int j = 0; j < outputString.length(); j++) 
                        {
                            if (j == 0 && outputString.charAt(j) != key) 
                            {
                                outputString.insert(0, key);
                                proceed = true;
                                break;    
                            }
                            else if (j == outputString.length() - 1) 
                            {
                                if (outputString.charAt(j) != key) 
                                {
                                    outputString.append(key);
                                    proceed = true;
                                    break;
                                }
                            }
                            else
                            {
                                if (j != 0 && outputString.charAt(j) != key && outputString.charAt(j - 1) != key && outputString.charAt(j + 1) != key) 
                                {
                                    outputString.insert(j, key);
                                    proceed = true;
                                    break;
                                }
                            }
                        }

                        if (!proceed) 
                        {
                            isPossible = false;
                            break;    
                        }
                    }    
                }
            }

            System.out.println(isPossible ? 1 : 0);
		}
		
		bi.close();
    }
}

/**
Input:
honeymoonroom

Its Correct output is:
1

And Your Code's output is:
0
*/
