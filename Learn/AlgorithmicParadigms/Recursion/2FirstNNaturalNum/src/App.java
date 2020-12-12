public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // System.out.println(SumOfFirstN_NaturalNums(2));
        // System.out.println(SumOfFirstN_NaturalNums(5));
        // System.out.println(SumOfFirstN_NaturalNums(10));

        // System.out.println(SumOfDigitsOfNum(101));

        System.out.println(Calculatefib(101));
    }

    public static long SumOfFirstN_NaturalNums(int n)
    {
        return (n == 1) ? 1 : n + SumOfFirstN_NaturalNums(n - 1);
    }

    public static long SumOfDigitsOfNum(long n)
    {
        return (n < 10) ? n : n % 10 + SumOfDigitsOfNum(n/10);
    }

    public static long Calculatefib(int n)
    {
        long memoize[] = new long[n + 1];
        // return fibDpMemoize(memoize,n);
        return fibDpTabulation(n);
    }

    // DP version of fib using Memoization technique (TOP-DOWN approach)
    public static long fibDpMemoize(long memoize[],int n)
    {
        if (n < 2) 
        {
            return n;    
        }

        if (memoize[n] != 0) 
        {
            return memoize[n];    
        }

        memoize[n] = fibDpMemoize(memoize,n - 1) + fibDpMemoize(memoize, n - 2);

        return memoize[n];
    }

    // DP version of fib using Tabulation technique (TOP-DOWN approach)
    public static long fibDpTabulation(int n)
    {
        long dp[] = new long[n + 1];

        // Base case values
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) 
        {
            dp[i] = dp[i - 1] + dp[i - 2];    
        }

        return dp[n];
    }

    // Non-DP fib function
    public static long fib(int n)
    {
        return (n < 2) ? n : fib(n - 2) + fib(n - 1);
    }

}
