import java.util.concurrent.atomic.AtomicInteger;

// https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1#
// Unsolved - Time Limit Exceeded
// Expected Time Limit 1.92sec

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // int val[] = new int[]{1,2,3};
        // int wt[] = new int[]{4,5,1};
        // int W = 4;

        // int val[] = new int[]{1,2,3};
        // int wt[] = new int[]{4,5,6};
        // int W = 3;

        int val[] = new int[]{60,100,120};
        int wt[] = new int[]{10,20,30};
        int W = 50;

        System.out.println(knapSack(W, wt, val, val.length));
    }

    // Returns the maximum value that can be put in a knapsack of capacity W 
    public static int knapSack(int W, int wt[], int val[], int n) 
    { 
        AtomicInteger maxValue = new AtomicInteger(0);
        KnapSack01(wt, val, W, 0, 0,0, maxValue);
        return maxValue.get();
    }

    public static void KnapSack01(int wt[], int val[],int maxCapacity,int currentCapacity,int currentN,int currentValue,AtomicInteger maxValue)
    {
        if (currentN < wt.length) 
        {
            // The item is included in the optimal subset.
            KnapSack01(wt, val, maxCapacity, currentCapacity + wt[currentN], currentN + 1, currentValue + val[currentN], maxValue);
                
            // The item is not included in the optimal set.
            KnapSack01(wt, val, maxCapacity, currentCapacity, currentN + 1, currentValue, maxValue);
        }

        if (currentCapacity <= maxCapacity) 
        {
            if (currentValue > maxValue.get()) 
            {
                maxValue.set(currentValue);
            }
        }
    }
}
