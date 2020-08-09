import java.util.Map;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1
// Execution Time:1.04

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static pair winner(String arr[], int n)
    {
        TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();

        for (String key : arr) 
        {
            if (treeMap.containsKey(key)) 
            {
                treeMap.replace(key, treeMap.get(key) + 1);
            }
            else
            {
                treeMap.put(key, 1);
            }
        }

        int maxSoFar = Integer.MIN_VALUE;
        pair winner = new pair("", -1);
        for (Map.Entry<String,Integer> entry : treeMap.entrySet()) 
        {
            if (entry.getValue() > maxSoFar) 
            {
                maxSoFar = entry.getValue();

                winner.first = entry.getKey();
                winner.second = maxSoFar;
            }
        }

        return winner;
    }
}

class pair 
{
    String first;
    int second;
    pair(String first , int second)
        {
            this.first = first;
            this.second = second;
        }
}
