import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1/?difficulty[]=1&page=3&query=difficulty[]1page3
// Execution Time:3.18
// Expected Time Complexity: O(NLogN) => met
// Expected Auxiliary Space: O(N) => met

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[] { 5, 5, 4, 6, 4 };
        System.out.println(sortByFreq(arr, arr.length));
    }

    public static ArrayList<Integer> sortByFreq(int arr[], int n) 
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        // O(n)
        for (int i = 0; i < arr.length; i++) 
        {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }

        LinkedList<Entry<Integer, Integer>> linkedList = new LinkedList<Entry<Integer, Integer>>(hashMap.entrySet());

        // n*logn sort
        linkedList.sort(new Comparator<Entry<Integer, Integer>>()
        {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
            {
                if (o1.getValue() == o2.getValue()) 
                {
                    return o1.getKey() - o2.getKey();
                }
                else
                {
                    return o2.getValue() - o1.getValue();
                }
            }
        });

        for (Entry<Integer,Integer> entry : linkedList) 
        {
            for (int i = 0; i < entry.getValue(); i++) 
            {
                result.add(entry.getKey());    
            }    
        }

        return result;
    }
}
