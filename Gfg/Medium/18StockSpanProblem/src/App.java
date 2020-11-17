// https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1/?difficulty[]=1&page=1&query=difficulty[]1page1#
// Execution Time:12.17

// Expected Time Complexity: O(N). Not met
// Expected Auxiliary Space: O(N). Met

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // int[] price = new int[] {100, 80, 60, 70, 60, 75, 85};

        int[] price = new int[] {10, 4, 5, 90, 120, 80};

        int[] span = calculateSpan(price, price.length);

        for (int i = 0; i < span.length; i++) 
        {
            System.out.print(span[i] + " ");
        }

        System.out.println();
    }

    public static int[] calculateSpan(int price[], int n)
    {
        int[] span = new int[price.length];

        for (int i = 0; i < price.length; i++) 
        {
            int length = 1;
            
            for (int j = i - 1; j >= 0; j--) 
            {
                if (price[j] <= price[i]) 
                {
                    length++;
                }
                else
                {
                    break;
                }
            }

            span[i] = length;
        }

        return span;
    }
}
