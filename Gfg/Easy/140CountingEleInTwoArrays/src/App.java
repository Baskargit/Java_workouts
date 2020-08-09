import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1
// Execution Time:5.89

public class App {
    public static void main(String[] args) throws Exception 
    {
        int arr1[] = new int[]{1,2,3,4,7,9};
        int arr2[] = new int[]{0,1,2,1,1,4};

        System.out.println(countEleLessThanOrEqual(arr1, arr2, arr1.length, arr2.length));
    }

    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        int count[] = new int[100001];

        for (int i = 0; i < arr2.length; i++) 
        {
            count[arr2[i]]++;
        }

        int previousCount = 0;

        for (int i = 0; i < count.length; i++)
        {
            count[i] += previousCount;
            previousCount = count[i];
        }

        ArrayList<Integer> finalList = new ArrayList<Integer>();

        for (int i = 0; i < arr1.length; i++) 
        {
            finalList.add(count[arr1[i]]);
        }

        return finalList;
    }
}
