import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1
// Execution Time:2.64

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int arr[] = new int[] {0,0,0,0,0,0};
        System.out.println(transitionPoint(arr, arr.length));
    }

    public static int transitionPoint(int arr[], int n) 
    {
        int point = Arrays.binarySearch(arr, 1);

        if (point > 0) 
        {
            for (int i = point; i >= 0; i--) 
            {
                if (arr[i] == 1) 
                {
                    point = i;    
                }
                else
                {
                    break;
                }
            }    
        }

        return point >= 0 ? point : -1;
    }
}

/**
Input:
49
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1

Its Correct output is:
19

And Your Code's output is:
20
 */
