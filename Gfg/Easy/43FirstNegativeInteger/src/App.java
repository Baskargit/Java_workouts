import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k/0
// Execution Time:0.2

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            String string[] = bi.readLine().trim().split(" ");
            int k = Integer.parseInt(bi.readLine().trim());

            int array[] = new int[n];

            for (int i = 0; i < array.length; i++) 
            {
                array[i] = Integer.parseInt(string[i]);
            }

            for (int i = 0; i < array.length; i++) 
            {
                if (i + k <= array.length) 
                {
                    int num = 0;

                    for (int j = i; j < i+k; j++) 
                    {
                        if (array[j] < 0) 
                        {
                            num = array[j];
                            break;    
                        }
                    }

                    System.out.print(num + " ");
                }

            }

            System.out.println();
		}
		
		bi.close();
    }
}
