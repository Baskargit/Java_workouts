// https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1/?difficulty[]=1&page=2&query=difficulty[]1page2#
// Merge k Sorted Arrays
// Execution Time:3.88

// Expected Time Complexity: O(nk Logk) => Not Met
// Expected Auxiliary Space: O(k) => Met

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception 
    {
        int arrays[][]={{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}};

        System.out.println(mergeKArrays(arrays, arrays.length));
    }

    public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k) 
    {
        ArrayList<Integer> sortedList = new ArrayList<Integer>();

        for (int i = 0; i < k; i++) 
        {
            for (int j = 0; j < k; j++) 
            {
                sortedList.add(arrays[i][j]);
            }    
        }

        Collections.sort(sortedList);

        return sortedList;
    }
}
