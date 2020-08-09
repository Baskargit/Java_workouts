import java.util.ArrayList;
import java.util.TreeSet;

// https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
// Execution Time:4.66

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int arr1[] = new int[]{1,1,1,1,1};
        int arr2[] = new int[]{2, 2, 2, 2, 2};

        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length));
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 0,j = 0; i < arr1.length || j < arr2.length; i++,j++) 
        {
            if (i < arr1.length) 
            {
                if (!treeSet.contains(arr1[i])) 
                {
                    treeSet.add(arr1[i]);
                }    
            }
            
            if (j < arr2.length) 
            {
                if (!treeSet.contains(arr2[j])) 
                {
                    treeSet.add(arr2[j]);
                } 
            }
        }

        return new ArrayList<Integer>(treeSet);
    }
}
