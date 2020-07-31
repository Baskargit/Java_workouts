import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/bird-and-maximum-fruit-gathering/0
// Worst Execution Time:13.22
// Best Execution Time:0.46

public class App 
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		long modulo = (long)Math.pow(10, 9) + 7;
		
		while(testcasecount-- > 0)
		{
			String nm[] = bi.readLine().trim().split(" ");
			
		    int n = Integer.parseInt(nm[0]);
		    int m = Integer.parseInt(nm[1]);
		    int totalLength = n + n;
		    
		    String string[] = bi.readLine().trim().split(" ");
		    int numbers[] = new int[totalLength];
		    
		    int a = 0;
		    for (int i = 0; i < n; i++) 
		    {
		    	numbers[i] = Integer.parseInt(string[i]);
		    	a += numbers[i];
			}
		    
		    int b = 0;
		    for (int i = n; i < totalLength; i++) 
		    {
				numbers[i] = numbers[b++];
			}
		    
		    long maxSum = -1,tempSum = 0; int pos = 0;
		    
		    if (m <= n) 
		    {
		    	for (int i = 0; i < totalLength; i++) 
			    {		    	
			    	tempSum += numbers[i] % modulo;
			    	
			    	if (i+1 >= m) 
			    	{
			    		maxSum = (tempSum > maxSum) ? tempSum : maxSum;
			    		tempSum -= numbers[pos++];
					} 
				}
			}
		    else 
		    {
				maxSum = a;
			}
		    
		    System.out.println((maxSum != -1) ? maxSum : tempSum);
		}
		
		bi.close();
	}
}

/*
Input:
9 7
3 8 4 7 8 9 5 0 8

Its Correct output is:
47

And Your Code's output is:
44 
 */
