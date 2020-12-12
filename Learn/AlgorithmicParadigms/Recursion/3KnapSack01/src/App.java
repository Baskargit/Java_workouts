public class App 
{
    public static int counter = 0;

    public static void main(String[] args) throws Exception 
    {
        int wt[] = new int[] { 10, 20, 30 };
        int val[] = new int[] { 60, 100, 120 }; 
        int W = 50;

        // int wt[] = new int[] { 10, 20, 30,1 };
        // int val[] = new int[] { 60, 100, 120,100 }; 
        // int W = 50;

        // int wt[] = new int[] {4,5,1};
        // int val[] = new int[] {1,2,3}; 
        // int W = 4;

        long memoization[][] = new long[wt.length][W + 1];
        for (int i = 0; i < memoization.length; i++) 
        {
            for (int j = 0; j <= W; j++) 
            {
                memoization[i][j] = -1;
            }    
        }

        //System.out.println(KnapsackRecursive(wt, val, W, 0));
        System.out.println(KnapsackRecursiveMemoization(wt, val, W, 0, memoization));
        System.out.println("Counter " + counter);
    }

    // DP solution with O(n*w) complexity
    public static long KnapsackRecursiveMemoization(int wt[],int val[],int maxWeight,int currentN,long memoization[][])
    {
        if (currentN < wt.length) 
        {
            // Avoid recomputing by returning results from here
            if (memoization[currentN][maxWeight] != -1) 
            {
                return memoization[currentN][maxWeight];
            }

            if (wt[currentN] > maxWeight) 
            {
                memoization[currentN][maxWeight] = KnapsackRecursiveMemoization(wt, val, maxWeight, currentN + 1,memoization);
            }
            else
            {
                memoization[currentN][maxWeight] = Math.max(val[currentN] + KnapsackRecursiveMemoization(wt, val, maxWeight - wt[currentN], currentN + 1,memoization),KnapsackRecursiveMemoization(wt, val, maxWeight, currentN + 1,memoization));
            }

            return memoization[currentN][maxWeight];
        }

        return 0;
    }

    // Non-DP solution witn O(2n) complexity
    public static long KnapsackRecursive(int wt[],int val[],int maxWeight,int currentN)
    {
        if (currentN < wt.length) 
        {
            counter++;

            if (wt[currentN] > maxWeight) 
            {
                return KnapsackRecursive(wt, val, maxWeight, currentN + 1);
            }
            else
            {
                return Math.max(val[currentN] + KnapsackRecursive(wt, val, maxWeight - wt[currentN], currentN + 1),KnapsackRecursive(wt, val, maxWeight, currentN + 1));
            }
        }

        return 0;
    }
}
