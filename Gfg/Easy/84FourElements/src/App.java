import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/four-elements/0
// Execution Time:0.2

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int x = Integer.parseInt(bi.readLine().trim());

            ArrayList<Integer> validNumbers = new ArrayList<Integer>();

            int tempSum = 0;
            for (int i = 0; i < n; i++) 
            {
                int num = Integer.parseInt(string[i]);
                
                if (num <= x) {
                    validNumbers.add(num);
                }

                tempSum += num;
            }

            int validNums[] = validNumbers.stream().mapToInt(i -> i).toArray();
            int result = 0;

            Arrays.sort(validNums);

            if (tempSum >= x) 
            {
                for (int i = 0; i < validNums.length; i++) 
                {
                    for (int j = i+1; j < validNums.length; j++)
                    {
                        for (int k = j+1; k < validNums.length; k++) 
                        {
                            for (int l = k+1; l < validNums.length; l++) 
                            {
                                if (validNums[i] + validNums[j] +validNums[k] + validNums[l] == x)  
                                {
                                    i = j = k = l = n;
                                    result = 1;
                                    break;
                                }
                            }
                        }    
                    }
                }
            }

            System.out.println(result);
		}
		
		bi.close();
    }
}

/**
Input:
19
6 33 23 33 18 31 44 25 27 44 37 4 44 25 15 14 30 28 13
76

Its Correct output is:
1

And Your Code's output is:
0

Input:
84
37 28 16 44 36 37 43 50 22 13 28 41 10 14 27 41 27 23 37 12 19 18 30 33 31 13 24 18 36 30 3 23 9 20 18 44 7 12 43 30 24 22 20 35 38 49 25 16 21 14 27 42 31 7 24 13 21 47 32 6 26 35 28 37 6 47 30 14 8 25 46 33 46 15 18 35 15 44 1 38 9 27 29 39
85

Its Correct output is:
1

And Your Code's output is:
0
 */
