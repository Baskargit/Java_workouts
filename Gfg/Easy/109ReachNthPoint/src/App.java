import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/reach-the-nth-point/0
// Execution Time:0.14

public class App 
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
		    int n = Integer.parseInt(bi.readLine().trim());
		    
		    long prevNum = 0,nextNum = 1;
		    
		    for (int i = 1; i <= n; i++) 
		    {
		    	long temp = nextNum;
		    	nextNum = prevNum + nextNum;
		    	prevNum = temp;
			}
		    
		    System.out.println(nextNum);
		}
		
		bi.close();
	}
}
