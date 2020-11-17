// https://practice.geeksforgeeks.org/problems/word-break1352/1/?difficulty[]=1&page=1&query=difficulty[]1page1
// Execution Time:0.31

// Expected time complexity: O(s2) Somewhat
// Expected auxiliary space: O(s) Not even close

import java.util.ArrayList;
import java.util.HashMap;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // String A = "ilikes";
        String A = "ilikesamsung";
        ArrayList<String> B = new ArrayList<String>();
        B.add("i");B.add("like");B.add("sam");B.add("sung");B.add("samsung");B.add("mobile");
        B.add("ice");B.add("cream");B.add("icecream");B.add("man");B.add("go");B.add("mango");
    
        System.out.println(wordBreak(A, B));
    }

    public static int wordBreak(String A, ArrayList<String> B )
    {
        int found = 1;

        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

        for (String key : B)
        {
            hashMap.put(key, -1);    
        }

        for (int i = 0; i < A.length();) 
        {
            StringBuilder tempKey = new StringBuilder();

            int matchEnd = -1;
        
            for (int j = i; j < A.length(); j++) 
            {
                tempKey.append(A.charAt(j));

                if (hashMap.containsKey(tempKey.toString())) 
                {
                    matchEnd = j;
                }
            }

            if (matchEnd != -1) 
            {
                i = matchEnd + 1;
            }
            else
            {
                found = 0;
                break;
            }
        }

        return found;
    }
}
