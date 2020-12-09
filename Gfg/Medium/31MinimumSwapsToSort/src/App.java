import java.util.LinkedList;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/minimum-swaps/1/?difficulty[]=1&page=2&query=difficulty[]1page2
// Unsolved

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int arr[] = new int[] {1, 5, 4, 3, 2};
        System.out.println(minSwaps(arr, arr.length));
    }

    public static int minSwaps(int[] arr, int N) 
    {
        int minSwap = 0;

        TreeMap<Integer,Integer> sortedTreeMap = new TreeMap<Integer,Integer>();
        TreeMap<Integer,LinkedList<Integer>> inputTreeMap = new TreeMap<Integer,LinkedList<Integer>>();

        for (int i = 0; i < arr.length; i++) 
        {
            if (inputTreeMap.containsKey(arr[i])) 
            {
                // Increment the count
                sortedTreeMap.replace(arr[i], sortedTreeMap.get(arr[i]) + 1);
            }
        }

        boolean proceed = true;

        while (proceed) 
        {
            
        }
        
        return minSwap;
	}
}
