import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x/0
// Execution Time:0.18

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String nx[] = bi.readLine().trim().split(" ");
            
            int n = Integer.parseInt(nx[0]);
            int x = Integer.parseInt(nx[1]);

            String string[] = bi.readLine().trim().split(" ");
            
            int numbers[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);  
            }

            int minSubArrayLen = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) 
            {
                int tempSum = numbers[i];
                int tempLen = 1;

                if (tempSum >= x) 
                {
                    minSubArrayLen = 1;
                    break;
                }
                else
                {
                    for (int j = i + 1; j < n; j++) 
                    {
                        int temp = tempSum + numbers[j];

                        if (temp <= x) 
                        {
                            tempSum = temp;
                            tempLen++;
                        }
                        else
                        {
                            minSubArrayLen = (tempLen + 1 < minSubArrayLen) ? tempLen + 1 : minSubArrayLen;
                            break;
                        }
                    }
                } 
            }

            System.out.println(minSubArrayLen);
 		}
		
		bi.close();
    }
}
