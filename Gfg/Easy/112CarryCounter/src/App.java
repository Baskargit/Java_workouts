import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/carry-counter/0/
// Execution Time:0.32

public class App 
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
		    String ab[] = bi.readLine().trim().split(" ");
		    
		    String numA,numB;
		    
		    if (ab[0].length() > ab[1].length()) 
		    {
				numA = ab[0];
				StringBuilder builder = new StringBuilder();
				
				int till = ab[0].length() - ab[1].length();
				
				for (int i = 0; i < till; i++) 
				{
					builder.append(0);	
				}
				
				numB = builder.toString() + ab[1];
			} 
		    else if(ab[1].length() > ab[0].length()) 
			{
		    	numB = ab[1];
				StringBuilder builder = new StringBuilder();
				
				int till = ab[1].length() - ab[0].length();
				
				for (int i = 0; i < till; i++) 
				{
					builder.append(0);	
				}
				
				numA = builder.toString() + ab[0];
			}
		    else
		    {
		    	numA = ab[0]; numB = ab[1];
		    }
		    
		    
		    int carryCounter = 0,carry = 0;
		    
		    for (int i = numA.length() - 1; i >= 0; i--) 
		    {
		    	int sum = (numA.charAt(i) - '0') + (numB.charAt(i) - '0') + carry;
		    	
		    	if (sum >= 10) {
					carry = sum / 10;
					carryCounter++;
				}
		    	else
		    	{
		    		carry = 0;
		    	}
			}
		    
		    System.out.println(carryCounter);
		}
		
		bi.close();	
	}
}

/*
Input:
79423727137365 31811167600288

Its Correct output is:
6

And Your Code's output is:
5 
 **/
