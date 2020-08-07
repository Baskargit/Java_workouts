import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/meta-strings/0/
// Execution Time:0.18

public class App 
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
		    String a = bi.readLine().trim();
		    String b = bi.readLine().trim();
		    
		    boolean isMetaString = false;
		    
		    if (!a.equals(b) && a.length() == b.length()) 
		    {
				char cha[] = a.toCharArray();
				char chb[] = b.toCharArray();
				
				for (int i = 0; i < cha.length; i++) 
				{
					for (int j = 0; j < chb.length; j++) 
					{
						if (i != j && chb[j] == cha[i]) 
						{
							char tempB[] = b.toCharArray();
							
							tempB[j] = tempB[i];
							tempB[i] = cha[i];
							
							if (new String(tempB).equals(a)) {
								isMetaString = true;
								i = a.length();
								break;
							}
						}
					}
				}
			} 
		    
		    System.out.println(isMetaString ? 1 : 0);
		}
		
		bi.close();
	}
	
}

