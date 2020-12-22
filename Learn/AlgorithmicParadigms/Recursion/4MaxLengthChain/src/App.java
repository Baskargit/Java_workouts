import java.util.Comparator;
// https://practice.geeksforgeeks.org/problems/max-length-chain/1/?category[]=Dynamic%20Programming&problemType=functional&page=1&sortBy=submissions&query=category[]Dynamic%20ProgrammingproblemTypefunctionalpage1sortBysubmissions
// Time Limit Exceeded
// Expected Time Limit 1.48sec

public class App {
    public static void main(String[] args) throws Exception 
    {
        Pair arr[] = new Pair[] { new Pair(5, 24),new Pair(39, 60),new Pair(15, 28), new Pair(27, 40),new Pair(50, 90) };
        // Pair arr[] = new Pair[] {new Pair(5, 10), new Pair(1, 11)};
        System.out.println(maxChainLength(arr, arr.length));
    }

    public static int maxChainLength(Pair arr[], int n)
    {
        int memoization[][] = new int[arr.length + 1][arr.length + 1];

        for (int i = 0; i < memoization.length; i++) 
        {
            for (int j = 0; j < memoization.length; j++) 
            {
                memoization[i][j] = -1;    
            }    
        }

        return (arr.length > 1) ? maxChainLength(arr, 1, arr[0], 1,memoization) : 1;
    }

    // Wrong DP logic
    // Not working
    public static int maxChainLength(Pair pairs[], int currentN,Pair previousPair,int maxLength,int memoization[][])
    {
        if (currentN < pairs.length) 
        {
            if (previousPair.y < pairs[currentN].x) 
            {
                // Include the current pair and also ignore the current pair
                memoization[currentN][maxLength] =  Math.max(maxChainLength(pairs, currentN + 1, pairs[currentN], maxLength + 1,memoization), maxChainLength(pairs, currentN + 1, previousPair, maxLength,memoization));
            }
            else
            {
                // Ignore the current pair at the same time consider the current pair as a starting point for the chain
                memoization[currentN][maxLength] = Math.max(maxChainLength(pairs, currentN + 1, previousPair, maxLength,memoization), maxChainLength(pairs, currentN + 1, pairs[currentN], 1,memoization));
            }
        }
        else
        {
            memoization[currentN][maxLength] = maxLength;
        }

        return memoization[currentN][maxLength];
    }

    // Recursive solution
    // Working => TLE
    public static int maxChainLength(Pair pairs[], int currentN,Pair previousPair,int maxLength)
    {
        if (currentN < pairs.length) 
        {
            if (previousPair.y < pairs[currentN].x) 
            {
                // Include the current pair and also ignore the current pair
                return Math.max(maxChainLength(pairs, currentN + 1, pairs[currentN], maxLength + 1), maxChainLength(pairs, currentN + 1, previousPair, maxLength));
            }

            // Ignore the current pair at the same time consider the current pair as a starting point for the chain
            return Math.max(maxChainLength(pairs, currentN + 1, previousPair, maxLength), maxChainLength(pairs, currentN + 1, pairs[currentN], 1));
        }

        return maxLength;
    }
}

class Pair
{
    int x,y;

    public Pair(int a, int b) 
    {
        x = a;
        y = b;
    }
}

class CompareByFirst implements Comparator<Pair>
{
   public int compare(Pair a, Pair b)
    {
        return a.x - b.x;
    }
}
