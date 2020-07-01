import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/swapping-pairs-make-sum-equal/0
// Execution Time:0.57

public class App {
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

            int arrayN[] = new int[n];
            int arrayM[] = new int[m];

            long nSum = 0, mSum = 0;

            for (int i = 0; i < n; i++) 
            {
                int val = Integer.parseInt(stringN[i]);
                arrayN[i] = val;
                nSum += val;
            }

            for (int i = 0; i < m; i++) 
            {
                int val = Integer.parseInt(stringM[i]);
                arrayM[i] = val;
                mSum += val;
            }

            boolean isPossible = false;
            long diff = Math.abs(nSum - mSum);

            for (int i = 0; i < n; i++) // nArray
            {
                long tempDiff = diff - arrayN[i];

                if (tempDiff > 0) 
                {
                    for (int j = 0; j < m; j++)  // mArray
                    {
                        if (arrayM[j] - tempDiff == 0) 
                        {
                            isPossible = true;
                            i = n;
                            break;   
                        }
                    }
                }
            }

            System.out.println(isPossible ? 1 : -1);
		}
		
		bi.close();
    }
}
