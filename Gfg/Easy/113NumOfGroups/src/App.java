import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/number-of-groups/0
// Execution Time:0.25

public class App 
{

	public static void main(String[] args) throws Exception 
	{
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
		    int n = Integer.parseInt(bi.readLine().trim());
		    
		    String string[] = bi.readLine().trim().split(" ");
		    
		    int numbers[] = new int[n];
		    
		    for (int i = 0; i < n; i++) 
		    {
				numbers[i] = Integer.parseInt(string[i]);
			}
		    
		    int groupCount = 0;
		    
		    for (int i = 0; i < numbers.length; i++) 
		    {
		    	for (int j = i + 1; j < numbers.length; j++) 
		    	{
		    		int sum = numbers[i] + numbers[j];
		    		
		    		groupCount += (sum % 3 == 0) ? 1 : 0;
		    		
		    		for (int k = j + 1; k < numbers.length; k++) 
		    		{
		    			if ((sum + numbers[k]) % 3 == 0) {
							groupCount++;
						}
					}
				}
			}
		    
		    System.out.println(groupCount);
		}
		
		bi.close();
	}

}
