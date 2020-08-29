// https://practice.geeksforgeeks.org/problems/occurences-of-2-as-a-digit/1
// Execution Time:0.25

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(count2s(100000));
    }

    public static long count2s(long n)
    {
        long counter = 0;

        for (int i = 1; i <= n; i++) 
        {
            int temp = i;

            while (temp > 0) 
            {
                counter += (temp % 10 == 2) ? 1 : 0;
                temp /= 10;    
            }
        }

        return counter;
    }
    
    public static long count2sinRangeAtDigit(long n, long d)
    {
        return 0;
    }
}
