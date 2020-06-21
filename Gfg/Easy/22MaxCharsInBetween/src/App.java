import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/maximum-number-of-characters-between-any-two-same-character/0
// Execution Time:0.37

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String string = bi.readLine();
            int strLen = string.length();

            int maxLength = -1;

            for (int i = 0; i < strLen; i++) 
            {
                int lastIndex = string.lastIndexOf(string.charAt(i));
                
                if (lastIndex != -1) 
                {
                    int len = lastIndex - i;
                    maxLength = (len > maxLength) ? len : maxLength;
                }
            }

            System.out.println((maxLength != -1) ? maxLength - 1 : -1);
		}
		
		bi.close();
    }
}

/**

Input:
JvIrhHTnFnyIpDKgcvjrfkmjGBUobEfmZNDgvYWCNWMEAZKCWUvcGHlmKfdMKiAJxGsuEoWsklWKkjOgdkiJtuyebBsLlSX

Its Correct output is:
82

And Your Code's output is:
75
 */
