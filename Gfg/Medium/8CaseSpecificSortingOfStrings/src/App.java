import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/case-specific-sorting-of-strings/0
// Execution Time:0.38

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String n = bi.readLine();
            char array[] = bi.readLine().trim().toCharArray();

            TreeMap<Character,Integer> lowercase = new TreeMap<Character,Integer>();
            TreeMap<Character,Integer> uppercase = new TreeMap<Character,Integer>();

            for (int i = 0; i < array.length; i++) 
            {
                if (Character.isUpperCase(array[i])) 
                {
                    if (uppercase.containsKey(array[i])) 
                    {
                        uppercase.replace(array[i], uppercase.get(array[i]) + 1);
                    } 
                    else 
                    {
                        uppercase.put(array[i], 1);
                    }
                }
                else
                {
                    if (lowercase.containsKey(array[i])) 
                    {
                        lowercase.replace(array[i], lowercase.get(array[i]) + 1);
                    } 
                    else 
                    {
                        lowercase.put(array[i], 1);
                    }
                } 
            }

            StringBuilder output = new StringBuilder();
            Map.Entry<Character,Integer> entry = null;

            for (int i = 0; i < array.length; i++) 
            {
                if (Character.isUpperCase(array[i])) 
                {
                    entry = uppercase.firstEntry();
                    output.append(entry.getKey());

                    if (entry.getValue() == 1) 
                    {
                        uppercase.pollFirstEntry();
                    }
                    else
                    {
                        uppercase.replace(entry.getKey(), entry.getValue() - 1);
                    }
                }
                else
                {
                    entry = lowercase.firstEntry();
                    output.append(entry.getKey());

                    if (entry.getValue() == 1) 
                    {
                        lowercase.pollFirstEntry();
                    }
                    else
                    {
                        lowercase.replace(entry.getKey(), entry.getValue() - 1);
                    }
                }
            }

            System.out.println(output.toString());
		}
		
		bi.close();
    }
}
