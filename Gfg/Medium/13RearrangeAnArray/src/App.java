import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1/?difficulty[]=1&page=1&query=difficulty[]1page1
// Execution Time:0.23

// Expected Time Complexity: O(N). {Met}
// Expected Auxiliary Space: O(1). {Not Met}

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        long arr[] = {4,0,2,1,3};

        // long arr[] = {5,0,3,7,1,4,6,2};

        arrange(arr, arr.length);

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static void arrange(long arr[], int n)
    {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < arr.length; i++) 
        {
            if (hashMap.containsKey((int)arr[i]))
            {
                long temp = arr[i];
                arr[i] = hashMap.get((int)arr[i]);
                hashMap.remove((int)arr[i]);
                hashMap.put(i, (int)temp);
            }
            else
            {
                hashMap.put(i, (int)arr[i]);
                arr[i] = arr[(int)arr[i]];
            }
        }
    }
}

/*
Input:
8
5 0 3 7 1 4 6 2

Its Correct output is:
4 5 7 2 0 1 6 3

And Your Code's output is:
4 5 7 2 0 1 6 2
*/
