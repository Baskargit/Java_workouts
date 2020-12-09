// https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1
// Not solved : Time Limit Exceeded

public class App {
    public static void main(String[] args) throws Exception 
    {
        int arr[] = new int[]{1, 5, 11, 5};
        // int arr[] = new int[]{1, 3, 5};

        System.out.println(equalPartition(arr.length, arr) == 1 ? "YES" : "NO");
    }

    public static int equalPartition(int N, int arr[])
    {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            totalSum += arr[i];
        }

        return isPartitionPossible(arr, totalSum, 0, totalSum,0) ? 1 : 0;
    }

    public static boolean isPartitionPossible(int arr[],int totalSum,int selSum,int nonSelSum,int currentN)
    {
        if (currentN < arr.length) 
        {
            if (selSum == nonSelSum) 
            {
                return true;
            }
            else
            {
                return 
                // Select
                isPartitionPossible(arr, totalSum, selSum + arr[currentN],nonSelSum - arr[currentN], currentN + 1) 
                || 
                // Ignore
                isPartitionPossible(arr, totalSum, selSum,nonSelSum, currentN+1);
            }
        }

        return false;
    }
}
