import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array/0/
// Execution Time:1.26

public class App 
{

	public static void main(String[] args) throws Exception 
	{
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
		    String nx[] = bi.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(nx[0]);
		    long x = Long.parseUnsignedLong(nx[1]);
		    
		    String array[] = bi.readLine().trim().split(" ");
		    
		    int index = -1;
		    
		    for(int i = 0; i < n; i++) 
		    {
		    	long num = Long.parseUnsignedLong(array[i]);
		    	
		    	if (num > x) {
					break;
				}
		    	else {
					index = i;
				}
		    }
		    
		    System.out.println(index);
		}
		
		bi.close();
	}

}
