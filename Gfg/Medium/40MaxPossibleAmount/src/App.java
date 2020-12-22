// https://practice.geeksforgeeks.org/problems/max-possible-amount2717/1/?difficulty[]=1&page=3&query=difficulty[]1page3
// Unsloved
// Can't understand the problem itself

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // int arr[] = new int[] {5, 3, 7, 10}; // 17
        int arr[] = new int[] {8, 15, 3, 7}; // 22
        // int arr[] = new int[] {9, 5, 10, 7, 20, 9, 11, 7}; // 50
        // int arr[] = new int[]{1, 11, 15, 4, 19, 8, 17, 5, 5, 6}; // 58

        System.out.println(maxAmount(arr, arr.length - 1));
    }

    public static int maxAmount(int arr[] , int n)
    {
        return maxAmountRecursive(arr,arr.length - 1);
    }

    // Recursive bruteforce approach
    public static int maxAmountRecursive(int arr[] , int n)
    {
       if (n >= arr.length / 2) 
       {
            return Math.max(arr[n] + maxAmountRecursive(arr, n - 1), arr[(arr.length - 1) - n] + maxAmountRecursive(arr, n - 1));
       }

       return 0;
    }

    // // Recursive bruteforce approach
    // public static int maxAmountRecursive(int arr[] , int n)
    // {
    //     if (n < 0) 
    //     {
    //         return 0;    
    //     }

    //     return Math.max(arr[n] + maxAmountRecursive(arr, n - 2), arr[n - 1] + maxAmountRecursive(arr, n - 2));
    //     // return Math.max(arr[n], arr[n - 1]) + maxAmountRecursive(arr, n - 2);

    //     // return Math.max(
    //     //         Math.max(arr[n] + maxAmountRecursive(arr, n - 2), arr[n] + maxAmountRecursive(arr, n - 3)),
    //     //         (n - 1 >= 0) 
    //     //             ? arr[n - 1] + Math.max(arr[n] + maxAmountRecursive(arr, n - 2), arr[n] + maxAmountRecursive(arr, n - 3))
    //     //             : 0
    //     //     );
    // }
}

/**
Input:
10
1 11 15 4 19 8 17 5 5 6

Its Correct output is:
58

And Your Code's output is:
68
*/

/**
Input:
8
9 5 10 7 20 9 11 7

Its Correct output is:
50

And Your Code's output is:
46

*/


