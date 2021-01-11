import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring/0/?difficulty[]=1&page=3&query=difficulty[]1page3
// Execution Time:0.12

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char input[] = bi.readLine().trim().toCharArray();
            
            int longestLength = 0;

            for(int i = 0; i < input.length; i++)
            {
                HashSet<Character> set = new HashSet<Character>();
                set.add(input[i]);
                
                for(int j = i + 1; j < input.length; j++)
                {
                    if (set.contains(input[j])) 
                    {
                        break;
                    }
                    else
                    {
                        set.add(input[j]);
                    }
                }

                longestLength = (set.size() > longestLength) ? set.size() : longestLength;
            }

            System.out.println(longestLength);
		}
		
		bi.close();     
    }
}
