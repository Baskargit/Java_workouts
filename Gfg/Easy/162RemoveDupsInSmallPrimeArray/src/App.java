import java.util.ArrayList;
import java.util.LinkedHashSet;

// https://practice.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1
// Execution Time:2.29

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();

        for (int i = 0; i < arr.length; i++) 
        {
            hashSet.add(arr[i]);
        }

        return new ArrayList<Integer>(hashSet);
    }
}
