import java.util.Map;
import java.util.TreeMap;
// https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1/?difficulty[]=1&page=3&query=difficulty[]1page3
// Execution Time:2.87

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // int arr[] = new int[] {2,6,1,9,4,5,3};
        int arr[] = new int[] {1,9,3,10,4,20,2};
        System.out.println(findLongestConseqSubseq(arr, arr.length));
    }

    public static int findLongestConseqSubseq(int arr[], int N)
	{
        TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();

        for (int i = 0; i < arr.length; i++) 
        {
            if (treeMap.containsKey(arr[i])) 
            {
                treeMap.put(arr[i], treeMap.get(arr[i]) + 1);    
            }
            else
            {
                treeMap.put(arr[i], 1);
            }
        }

        int longestLength = 1;
        int tempLength = 0,prevNum = -1;
        for (Map.Entry<Integer,Integer> entry : treeMap.entrySet()) 
        {
            if (prevNum == -1) 
            {
                tempLength++;
            }
            else
            {
                tempLength = (entry.getKey() - prevNum == 1) ? tempLength + 1 : 1; 
            }

            prevNum = entry.getKey();

            longestLength = (tempLength > longestLength) ? tempLength : longestLength;
        }

        return longestLength;
	}
}

/**
Input:
20
6 6 2 3 1 4 1 5 6 2 8 7 4 2 1 3 4 5 9 6

Its Correct output is:
9

And Your Code's output is:
4
*/
