import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/longest-substring-with-equal-number-of-0s-and-1s/0
// Expected Time Limit < 6.28sec

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char inputString[] = bi.readLine().trim().toCharArray();
            
            int zeroCount = 0,onesCount = 0;

            for (int i = 0; i < inputString.length; i++) 
            {
                if (inputString[i] == '1') {
                    onesCount++;
                } else {
                    zeroCount++;
                }
            }

            int maxSubStringLength = 0;
            int iterationLength = inputString.length;
            if (zeroCount == onesCount) 
            {
                maxSubStringLength = inputString.length;
            }
            else
            {
                for (int i = 0; i < inputString.length; i++) 
                {
                    if (iterationLength >= maxSubStringLength) 
                    {
                        int tempZeroCount = (inputString[i] == '0') ? 1 : 0;
                        int tempOnesCount = (inputString[i] == '1') ? 1 : 0;
                        int length = 1;

                        for (int j = i + 1; j < inputString.length; j++) 
                        {
                            if (inputString[j] == '1') 
                            {
                                tempOnesCount++;
                            }
                            else
                            {
                                tempZeroCount++;
                            }

                            length++;

                            if (tempOnesCount == tempZeroCount) 
                            {
                                maxSubStringLength = (length > maxSubStringLength) ? length : maxSubStringLength;
                            }
                        }    
                    }
                    else
                    {
                        break;
                    }
                    iterationLength--;
                }
            }

            System.out.println(maxSubStringLength);
		}
		
		bi.close();
    }
}
