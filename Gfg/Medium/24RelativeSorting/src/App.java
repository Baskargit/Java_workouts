// https://practice.geeksforgeeks.org/problems/relative-sorting4323/1/?difficulty[]=1&page=2&query=difficulty[]1page2
// Execution Time:1.61

// Expected Time Complexity: O(NlogN).
// Expected Auxiliary Space: O(N).

import java.util.TreeMap;
import java.util.Map;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // int A1[] = new int[] {2,1,2,5,7,1,9,3,6,8,8};
        // int A2[] = new int[] {2,1,8,3};

        int A1[] = new int[] {45,15,23,8,5,12,26,444,888,151,12,23,45,15,56};
        int A2[] = new int[] {15,888,444,5,8,12,23};

        sortA1ByA2(A1, A1.length, A2, A2.length);

        for (int i = 0; i < A1.length; i++) 
        {
            System.out.print(A1[i] + " ");
        }

        System.out.println();
    }

    public static void sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();

        for (int i = 0; i < A1.length; i++) 
        {
            if (treeMap.containsKey(A1[i])) 
            {
                treeMap.replace(A1[i], treeMap.get(A1[i]) + 1);
            }
            else
            {
                treeMap.put(A1[i], 1);
            }    
        }

        int pos = 0;
        for (int i = 0; i < A2.length; i++) 
        {
            if (treeMap.containsKey(A2[i])) 
            {
                int limit = pos + treeMap.get(A2[i]);

                for (int j = pos; j < limit; j++) 
                {
                    A1[pos++] = A2[i];    
                }

                treeMap.remove(A2[i]);
            }    
        }

        for (Map.Entry<Integer,Integer> entry : treeMap.entrySet()) 
        {
            int limit = pos + entry.getValue();

            for (int i = pos; i < limit; i++) 
            {
                A1[pos++] = entry.getKey();    
            }    
        }
    }
}

/**

Input:
15 7
45 15 23 8 5 12 26 444 888 151 12 23 45 15 56
15 888 444 5 8 12 23

Its Correct output is:
15 15 888 444 5 8 12 12 23 23 26 45 45 56 151

And Your Code's output is:
15 15 888 444 5 8 12 12 23 23 151 56 26 45 45

*/
