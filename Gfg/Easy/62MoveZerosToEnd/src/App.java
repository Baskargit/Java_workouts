import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array/0
// Execution Time:0.45

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int numbers[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);    
            }

            StringBuilder stringBuilder = new StringBuilder();

            int newArray[] = new int[n];
            int zeroPointer = n - 1;
            int nonZeroPointer = 0;

            for (int i = 0; i < n; i++) 
            {
                if (numbers[i] == 0) 
                {
                    newArray[zeroPointer--] = 0;
                }
                else
                {
                    newArray[nonZeroPointer++] = numbers[i];
                }
            }

            for (int i = 0; i < newArray.length; i++) 
            {
                stringBuilder.append(newArray[i] + " ");
            }

            System.out.println(stringBuilder.toString().trim());
		}
		
		bi.close();
    }
}

/**
Input:
41
67 34 0 69 24 78 58 62 64 5 45 81 27 61 91 95 42 27 36 91 4 2 53 92 82 21 16 18 95 47 26 71 38 69 12 67 99 35 94 3 11

Its Correct output is:
67 34 69 24 78 58 62 64 5 45 81 27 61 91 95 42 27 36 91 4 2 53 92 82 21 16 18 95 47 26 71 38 69 12 67 99 35 94 3 11 0

*/
