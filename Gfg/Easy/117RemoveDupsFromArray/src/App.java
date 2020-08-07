import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

// https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
// Execution Time:4.44

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // Functional problem
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) 
    {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        
        for (int i = 0; i < arr.length; i++) 
        {
            if (!hashSet.add(arr[i])) {
                treeSet.add(arr[i]);
            }
        }

        if (treeSet.size() == 0) {
            treeSet.add(-1);
        }

        return new ArrayList<Integer>(treeSet);
    }
}
