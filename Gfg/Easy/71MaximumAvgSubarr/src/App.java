import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/maximum-average-subarray/0
// Execution Time:0.36

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int k = Integer.parseInt(bi.readLine().trim());
            int n = Integer.parseInt(bi.readLine().trim());

            String string[] = bi.readLine().trim().split(" ");
            int numbers[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);    
            }

            int maxAverage = Integer.MIN_VALUE;
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < n; i++) 
            {
                int div = 1,length = 1;
                int tempAvg = numbers[i];
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(numbers[i] + " ");
                
                if (length == k) 
                {
                    if (tempAvg > maxAverage) 
                    {
                        maxAverage = tempAvg;
                        output = new StringBuilder(numbers[i] + "");
                    }
                }
                else
                {
                    for (int j = i + 1; j < n; j++) 
                    {
                        div++;
                        length++;
                        tempAvg += numbers[j];
                        stringBuilder2.append(numbers[j] + " ");

                        if (length == k && tempAvg/div > maxAverage) 
                        {
                            output = new StringBuilder(stringBuilder2.toString());
                            maxAverage = tempAvg/div;
                        }
                    }
                }
            }

            System.out.println(output.toString().trim());
        }
    }
}

/**

Input:
1
15
167 -201 -465 394 203 311 -178 -167 173 164 -359 211 -247 368 47

Its Correct output is:
394

And Your Code's output is:
394 203 311

Input:
5
13
-209 336 -126 -480 96 -479 -152 -301 168 -16 -219 234 -447

Its Correct output is:
-301 168 -16 -219 234

And Your Code's output is:

 */
