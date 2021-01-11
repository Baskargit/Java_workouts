import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/prime-factors-and-their-powers/0/?difficulty[]=1&page=3&query=difficulty[]1page3
// Execution Time:0.42

public class App
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            LinkedHashMap<Integer,Integer> hashMap = new LinkedHashMap<Integer,Integer>();
            hashMap.put(2,0);

            for (int i = 3; i <= n; i++) 
            {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) 
                {
                    if (i % j == 0) 
                    {
                        isPrime = false;
                        break;    
                    }
                }

                if (isPrime) 
                {
                    hashMap.put(i,0);    
                }
            }

            StringBuilder output = new StringBuilder();

            if (!hashMap.containsKey(n)) 
            {
                LinkedList<Integer> finalList = new LinkedList<Integer>();
                finalList.add(n);

                while (true)
                {
                    boolean proceed = false;
                    int x = 0, y = 0,z = 0;

                    for (Integer num : finalList) 
                    {
                        if (!hashMap.containsKey(num)) 
                        {
                            proceed = true;

                            for (int i = 2; i < num; i++) 
                            {
                                if (num % i == 0) 
                                {
                                    x = i;
                                    y = num/i;
                                    z = num;
                                    break;
                                }    
                            }

                            break;
                        }
                    }

                    if (!proceed) 
                    {
                        break;
                    }
                    else
                    {
                        finalList.removeFirstOccurrence(z);
                        finalList.add(x);
                        finalList.add(y);
                    }
                }

                // Count factors
                TreeMap<Integer,Integer> primeFactors = new TreeMap<Integer,Integer>(Collections.reverseOrder());

                for (Integer num : finalList) 
                {
                    if (primeFactors.containsKey(num)) 
                    {
                        primeFactors.put(num, primeFactors.get(num) + 1);
                    }    
                    else
                    {
                        primeFactors.put(num, 1);
                    }
                }

                // Append prime facors to output
                for (Map.Entry<Integer,Integer> map : primeFactors.entrySet()) 
                {
                    output.append(map.getKey() + " " + map.getValue() + " ");
                }

                output.setLength(output.length() - 1);
            }
            else
            {
                output.append(n + " " + 1);
            }
            
            System.out.println(output.toString());
		}
		
		bi.close();
    }
}

/**
Input:
85

Its Correct output is:
5 1 17 1

And Your Code's output is:
17 1 5 1
*/