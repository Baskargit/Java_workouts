import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/rotation/0
// Execution Time:0.99

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            long numbers[] = new long[n];

            long sum = 0,max = 0;
            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Long.parseUnsignedLong(string[i]);  
                sum += numbers[i];
                max = (numbers[i] > max) ? numbers[i] : max;
            }

            int rotationCount = 0;

            if (n * n != sum) 
            {
                if (numbers[n - 1] == max) 
                {
                    int index = -1;
                    for (int i = 0; i < n - 1; i++) 
                    {
                        if (numbers[i] != max) 
                        {
                            index = i;
                            break;
                        }
                    }

                    rotationCount = (index != -1) ? index : 0;
                }
                else
                {
                    int index = -1;

                    for (int i = 0; i < n; i++) 
                    {
                        index = (numbers[i] == max) ? i : index;
                    }
                    rotationCount = index + 1;
                }
            }
            else
            {
                rotationCount = 0;
            }

            System.out.println(rotationCount);
		}
		
		bi.close();
    }
}

/**
Input:
5
2 1 2 2 2

Its Correct output is:
1

And Your Code's output is:
0
 */
