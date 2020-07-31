import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

// https://practice.geeksforgeeks.org/problems/nth-item-through-sum/0/
// Execution Time:1.34

public class App 
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
		    String nm[] = bi.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(nm[0]);
		    int m = Integer.parseInt(nm[1]);
		    
		    String stringN[] = bi.readLine().trim().split(" ");
		    String stringM[] = bi.readLine().trim().split(" ");
		    
		    int numberN[] = new int[n];
		    int numberM[] = new int[m];
		    
		    int k = Integer.parseInt(bi.readLine().trim());
		    
		    if (n == m) 
		    {
				for (int i = 0; i < n; i++) 
				{
					numberN[i] = Integer.parseInt(stringN[i]);
					numberM[i] = Integer.parseInt(stringM[i]);
				}
			} 
		    else 
		    {
		    	for (int i = 0; i < n; i++) 
				{
					numberN[i] = Integer.parseInt(stringN[i]);
				}
		    	for (int i = 0; i < m; i++) 
				{
					numberM[i] = Integer.parseInt(stringM[i]);
				}
			}
		    
		    TreeSet<Integer> treeSet = new TreeSet<Integer>();
		    		    
		    for (int i = 0; i < n; i++) 
		    {
				for (int j = 0; j < m; j++) 
				{
					treeSet.add(numberN[i] + numberM[j]);
				}
			}
		    
		    int nthItem = -1,counter = 0;
		    
		    for (Integer integer : treeSet) 
		    {
				if (++counter == k) {
					nthItem = integer;
					break;
				}
			}
		    
		    System.out.println(nthItem);
		}
		
		bi.close();
	}
}
