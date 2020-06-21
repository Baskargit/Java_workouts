import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/k-pangrams/0
// Execution Time:0.16

public class App {
    public static void main(String[] args) throws Exception
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char array[] = bi.readLine().toCharArray();
            
            int k = Integer.parseInt(bi.readLine().trim());

            int counter[] = new int[26];
            int lettersUsed = 0;

            if (array.length >= 26) 
            {
                for (int i = 0; i < array.length; i++) 
                {
                    if (counter[array[i] - 'a'] == 0) 
                    {
                        counter[array[i] - 'a'] = 1;
                        lettersUsed++;    
                    }
                    else
                    {
                        counter[array[i] - 'a']++;
                    }
                }    
            }
            else
            {
                k = 0;
            }

            
            System.out.println((lettersUsed+k >= 26) ? 1 : 0);
		}
		
		bi.close();
    }
}

/**
Input:
qwdfsdsdg
12132131

Its Correct output is:
0

And Your Code's output is:
1 
*/