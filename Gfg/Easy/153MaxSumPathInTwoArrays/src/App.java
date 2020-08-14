// https://practice.geeksforgeeks.org/problems/max-sum-path-in-two-arrays/1
// Unsolved

public class App {
    public static void main(String[] args) throws Exception 
    {
        int ar1[] = {2,3,7,10,12};
        int ar2[] = {1,5,7,8,};
        System.out.println(maxPathSum(ar1, ar2));
    }

    public static int maxPathSum(int ar1[], int ar2[])
    {
        int maxSum = 0;

        int sum1 = 0,sum2 = 0;
        int i = 0,j = 0;
        while (i < ar1.length || j < ar2.length) 
        {
            sum1 += (i < ar1.length) ? ar1[i] : 0;
            sum2 += (j < ar2.length)  ? ar2[j] : 0;

            if (i < ar1.length && j < ar2.length) 
            {
                if (ar1[i] == ar2[j])
                {
                    if (i + 1 < ar1.length && j + 1 < ar2.length) 
                    {
                        if (!(sum1 >= sum2))
                        {
                            int temp = sum2;
                            sum2 = sum1;
                            sum1 = temp;
                        }
                    }
                    else if (i + 1 < ar1.length) 
                    {
                        sum1 = (sum2 > sum1) ? sum2 : sum1;
                    }
                    else
                    {
                        sum2 = (sum1 > sum2) ? sum1 : sum2;
                    }
                }
            }

            i++;j++;
        }

        maxSum = (sum1 >= sum2) ? sum1 : sum2;

        return maxSum;
    }
}

/**
Input:
17 34
1 1 1 1 2 2 4 4 5 5 5 6 7 7 8 8 9
1 1 1 1 1 1 2 2 2 2 2 2 3 3 3 3 3 4 4 4 4 5 5 6 6 7 7 7 7 8 8 8 9 9

Its Correct output is:
146

And Your Code's output is:
141
 */
