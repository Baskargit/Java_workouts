import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://practice.geeksforgeeks.org/problems/count-palindrome-sub-strings-of-a-string/0/?difficulty[]=1&page=3&query=difficulty[]1page3
// Execution Time:2.19

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
        
        // Bruteforce approach
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine());
            char inputString[] = bi.readLine().toCharArray();

            int count = 0;

            if (inputString.length > 1) 
            {
                for (int i = 0; i < inputString.length; i++) 
                {
                    StringBuilder sb = new StringBuilder();
                    sb.append(inputString[i]);

                    for (int j = i + 1; j < inputString.length; j++) 
                    {
                        sb.append(inputString[j]);
                        count += (sb.toString().equals(new StringBuilder(sb).reverse().toString())) ? 1 : 0 ;
                    }    
                }
            }
            
            System.out.println(count);
		}
		
		bi.close();
    }
}
