import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/missing-element-of-ap/0/
// Execution Time:0.17

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String array[] = bi.readLine().trim().split(" ");
            int prevDiff = 0;
            int res = 0;

            for (int i = 0; i < n; i++) 
            {
                int num = Integer.parseInt(array[i]);

                if (i + 1 < array.length) 
                {
                    int num1 =  Integer.parseInt(array[i+1]);
                    int diff = num1 - num;

                    if (prevDiff == 0) 
                    {
                        if (n == 2) 
                        {
                            res = (num1 - num)/2 + num;
                            break;    
                        }
                        prevDiff = num1 - num;    
                    }
                    else
                    {
                        if (diff != prevDiff) 
                        {
                            res = Integer.parseInt(array[i - 1]) + diff;
                            break;
                        }
                    }
                }
            }

            System.out.println(res);
		}
		
		bi.close();
    }
}
