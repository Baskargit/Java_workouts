// https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1
// Execution Time:1.81


public class App {
    public static void main(String[] args) throws Exception 
    {
        // Functional problem
    }

    public static long[] productExceptSelf(int arr[], int n) 
	{ 
        long output[] = new long[arr.length];

        long multiplied = 1,zeroCount = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            multiplied *= (arr[i] != 0) ? arr[i] : 1;
            zeroCount += (arr[i] == 0) ? 1 : 0;
        }

        for (int i = 0; i < output.length; i++) 
        {
            if (zeroCount == 0) 
            {
                output[i] = multiplied/arr[i];
            }
            else if (zeroCount == 1) 
            {
                output[i] = (arr[i] == 0) ? multiplied : 0;
            }
            else
            {
                output[i] = 0;
            }
        }

        return output;
	} 
}
