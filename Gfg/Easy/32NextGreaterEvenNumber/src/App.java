import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// https://practice.geeksforgeeks.org/problems/next-greater-even-number/0
// Expected Time Limit < 3.208sec

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String numString = bi.readLine().trim();
            int numLength = numString.length();

            long number = Long.parseUnsignedLong(numString);
            
            long nextGreaterNumber = -1;
            
            if (number > 9) 
            {
                ArrayList<Long> nextGreaterNumbers = new ArrayList<Long>();

                // For selection
                for (int i = 0; i < numLength; i++) 
                {
                    for (int j = 0; j < numLength; j++) 
                    {
                        for (int k = 0; k < numLength; k++) 
                        {

                        }
                    }
                }

                if (nextGreaterNumbers.size() > 0) 
                {
                    Collections.sort(nextGreaterNumbers);
                    
                    nextGreaterNumber = nextGreaterNumbers.iterator().next().longValue();
                }
            }
            

            System.out.println(nextGreaterNumber);
		}
		
		bi.close();
    }

}
