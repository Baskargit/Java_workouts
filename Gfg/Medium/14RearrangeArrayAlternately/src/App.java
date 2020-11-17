// https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1/?difficulty[]=1&page=1&query=difficulty[]1page1
// Execution Time:0.97

// Expected Time Complexity: O(N). {Met}
// Expected Auxiliary Space: O(1). {Not Met}

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // int arr[] = {1,2,3,4,5,6};
        int arr[] = {1,2,3,4,5};

        rearrange(arr, arr.length);

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");    
        }

        System.out.println();
    }

    public static void rearrange(int arr[], int n)
    {
        int a[] = new int[n];
        int pointer = 0;

        for (int i = 0,j = n - 1; i < j; i++,j--) 
        {
            a[pointer++] = arr[j];
            a[pointer++] = arr[i];
        }

        if (n % 2 == 1) {
            a[pointer] = arr[n/2];
        }

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = a[i];    
        }
    }
}
