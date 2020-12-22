// https://practice.geeksforgeeks.org/problems/max-sum-in-the-configuration/1/?difficulty[]=1&page=3&query=difficulty[]1page3#
// Time Limit Exceeded
// Expected Time Limit 4.60sec
// Video explanation for O(n) =>  https://www.youtube.com/watch?v=3YNs_Ggqb-Q&feature=youtu.be

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int A[] = new int[]{8,3,1,2};
        System.out.println(max_sum(A, A.length));
    }

    // Brutfore approach
    public static int max_sum(int A[], int n)
    {
        int maxSumConfig = 0;

        for (int i = 0; i < A.length; i++) 
        {
            int tempSum = 0;
            int multiplier = 0;

            for (int j = i; j < A.length; j++) 
            {
                tempSum += A[j] * multiplier++;
            }
            
            for (int j = 0; j < i; j++) 
            {
                tempSum += A[j] * multiplier++;
            }

            maxSumConfig = (tempSum > maxSumConfig) ? tempSum : maxSumConfig;
        }

        return maxSumConfig;
    }	
}
