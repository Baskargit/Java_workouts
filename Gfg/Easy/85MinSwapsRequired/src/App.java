import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-group-all-1s-together/0
// Unsolved

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            char input[] = bi.readLine().trim().replaceAll(" ", "").toCharArray();

            boolean isEven = (n % 2 == 0) ? true : false;

            int minSwaps = 0;

            int mid = n/2;
            int zeroCount = 0, oneCount = 0;

            if (n >= 3) 
            {
                if (isEven) 
                {
                    int tempZero = 0,tempOne = 0;

                    for (int i = 0; i < mid - 1; i++) 
                    {
                        tempZero += (input[i] == '0') ? 1 : 0;
                        tempOne += (input[i] == '1') ? 1 : 0;
                    }
 
                    if (tempZero > zeroCount) 
                    {
                        minSwaps =  tempOne;

                        zeroCount = tempZero;
                        oneCount = tempOne;
                    }

                    tempZero = tempOne = 0;
                    for (int i = mid + 1; i < n; i++) 
                    {
                        tempZero += (input[i] == '0') ? 1 : 0;
                        tempOne += (input[i] == '1') ? 1 : 0;
                    }

                    minSwaps = (tempZero > zeroCount) ? tempOne : minSwaps;
                }
                else
                {
                    int tempZero = 0,tempOne = 0;
                    for (int i = 0; i < n; i++) 
                    {
                        if (i == mid) 
                        {
                            if (tempZero > zeroCount) 
                            {
                                minSwaps =  tempOne;

                                zeroCount = tempZero;
                                oneCount = tempOne;
                            }

                            tempOne = tempZero = 0;
                        }
                        else
                        {
                            tempZero += (input[i] == '0') ? 1 : 0;
                            tempOne += (input[i] == '1') ? 1 : 0;
                        }
                    }

                    if (tempZero > zeroCount) 
                    {
                        minSwaps =  tempOne;

                        zeroCount = tempZero;
                        oneCount = tempOne;
                    }
                }
            }
            else
            {
                minSwaps = 0;
            }
    
            System.out.println(minSwaps);
		}
		
		bi.close();
    }
}

/**

For Input:
2
41
1 1 1 0 1 0 1 0 0 0 0 1 1 0 0 0 0 0 1 0 0 1 0 0 0 0 0 0 1 0 1 1 1 0 1 1 0 0 1 0 1
29
1 0 0 0 0 0 0 1 1 1 0 1 1 1 0 1 1 1 0 0 0 1 0 0 0 0 0 0 1
Your Output is:
8
5

Input:
41
1 1 1 0 1 0 1 0 0 0 0 1 1 0 0 0 0 0 1 0 {0} 1 0 0 0 0 0 0 1 0 1 1 1 0 1 1 0 0 1 0 1

Its Correct output is:
9

And Your Code's output is:
8

 */