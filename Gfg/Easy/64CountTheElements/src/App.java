import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/count-the-elements/0
// Execution Time:3.35

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());

            String string1[] = bi.readLine().trim().split(" ");
            String string2[] = bi.readLine().trim().split(" ");

            int array1[] = new int[n];
            int array2[] = new int[n];

            int array2Max = 0;

            for (int i = 0; i < n; i++) 
            {
                array1[i] = Integer.parseInt(string1[i]);
                array2[i] = Integer.parseInt(string2[i]);

                array2Max = (array2[i] > array2Max) ? array2[i] : array2Max;
            }

            // Sort array2 for binary search
            Arrays.sort(array2);

            int queryCount = Integer.parseInt(bi.readLine().trim());

            while (queryCount-- > 0) 
            {
                int key = array1[Integer.parseInt(bi.readLine().trim())];

                if (key >= array2Max) 
                {
                    System.out.println(n);    
                }
                else
                {
                    int counter = 0;

                    for (int i = 0; array2[i] <= key; i++) 
                    {
                        counter++;
                    }

                    System.out.println(counter);
                }
            }
        }
    }
}
