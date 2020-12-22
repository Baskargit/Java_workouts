// https://practice.geeksforgeeks.org/problems/container-with-most-water0535/1/?difficulty[]=1&page=3&query=difficulty[]1page3
// Time Limit Exceeded
// Expected Time Limit 2.21sec

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // int a[] = new int[] {1,5,4,3};
        // int a[] = new int[] {3,1,2,4,5};
        int a[] = new int[] {34,1,69,24,78,58,62,64,5,45,81,27,61,91,95,42,27};
        System.out.println(maxArea(a, a.length));
    }

    public static long maxArea1(int A[], int len)
    {
        long maxArea = 0;

        for (int i = 0; i < len; i++)
        {
            long tempArea = Math.min(A[A.length - 1], A[i]) * ((A.length - 1) - i);
            maxArea = (tempArea > maxArea) ? tempArea : maxArea;
        }

        return maxArea;
    }

    // BruteForce approach
    public static long maxArea(int A[], int len)
    {
        long maxArea = 0;

        long max = 0;
        int maxIndex = 0;

        for (int i = 0; i < len; i++)
        {
            if (A[i] > max) 
            {
                max = A[i];
                maxIndex = i;    
            }
        }

        for (int i = 0; i < maxIndex; i++)
        {
            long tempArea = (maxIndex - i) * A[i];
            maxArea = (tempArea > maxArea) ? tempArea : maxArea;
        }

        for (int i = maxIndex + 1; i < A.length; i++) 
        {
            long tempArea = (i - maxIndex ) * A[i];
            maxArea = (tempArea > maxArea) ? tempArea : maxArea;
        }

        return maxArea;
    }
}

/**
Input:
17
34 1 69 24 78 58 62 64 5 45 81 27 61 91 95 42 27

Its Correct output is:
828

And Your Code's output is:
432

Input:
36
91 4 2 53 92 82 21 16 18 95 47 26 71 38 69 12 67 99 35 94 3 11 22 33 73 64 41 11 53 68 47 44 62 57 37 59

Its Correct output is:
2065

And Your Code's output is:
1547
*/
