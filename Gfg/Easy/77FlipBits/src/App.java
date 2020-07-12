import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/flip-bits/0
// TLE

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            char array[] = bi.readLine().trim().replaceAll(" ", "").toCharArray();

            int zeroCount = 0,oneCount = 0,maxLen = 0;

            for (int i = 0; i < n; i++) 
            {
                if (array[i] == '1') { oneCount++; } else{ zeroCount++; }
            }

            for (int i = 0; i < n; i++) 
            {
                int tempOneCount = oneCount;
                
                for (int j = i; j < n; j++) 
                {
                    if (array[j] == '1') { tempOneCount--; } else{ tempOneCount++; }
                    
                    if (tempOneCount > maxLen) {
                        maxLen = tempOneCount;
                    }
                }
            }
            
            System.out.println(maxLen);
		}
		
		bi.close();
    }
}

/**
9
0 0 1 0 0 0 0 0 1
o/p => 8

6
1 1 0 0 1 1
o/p =>  6
 */