import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/game-with-string/0/
// Execution Time:0.24

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String s = bi.readLine();
	        int k = Integer.parseInt(bi.readLine());
	        char[] arr = s.toCharArray();
	        
	        HashMap<Character,Integer> hm = new HashMap<Character,Integer>(); 
	        for(int i=0;i<arr.length;i++)
	        {
	            if(hm.containsKey(arr[i]))
	            {
	                hm.put(arr[i],hm.get(arr[i])+1);
	            }
	            else
	            {
	                hm.put(arr[i],1);
	            }
	        }
	        
	        while(k>0)
	        {
	            int max = Integer.MIN_VALUE;
	            char maxc = ' ';
	            for(Map.Entry<Character,Integer> m : hm.entrySet())
	            {
	                if((Integer)m.getValue()>max)
	                {
	                    max = (Integer)m.getValue();
	                    maxc = (Character)m.getKey();
	                }
	            }
	            hm.put(maxc,hm.get(maxc)-1);
	            k--;
	        }
	        
	       int sum = 0;
	       for(Map.Entry<Character,Integer> m : hm.entrySet())
	       {
	            int num = (Integer)m.getValue();
	            sum = sum + (num*num);
           }
           
	       System.out.println(sum);
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