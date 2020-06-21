import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/101-pattern-count/0
// Execution Time:0.15

public class App {
    public static void main(String[] args) throws Exception
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char array[] = bi.readLine().trim().toCharArray();
            
            int count = 0;

            for (int i = 0; i < array.length; i++) 
            {
                if (array[i] == '1') 
                {
                    int tempCount = 0;
                    while (++i < array.length) 
                    {
                        if (array[i] == '1') 
                        {
                            count = (tempCount > 0) ? count+1 : count;
                            --i;
                            break;
                        }
                        else if(array[i] == '0')
                        {
                            tempCount++;
                        } 
                        else
                        {
                            break;
                        }
                    }
                }    
            }

            System.out.println(count);
		}
		
		bi.close();
    }
}

/**
Input:
abc1010101bca10

Its Correct output is:
3

And Your Code's output is:
2
 */
