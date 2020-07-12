import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/remove-minimum-elements/0
// Execution Time:1.62

public class App {
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

            Arrays.sort(numbers);

            int minRemoves = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) 
            {
                int doubled = numbers[i] * 2;

                int l = 0;
                int h = n;

                // Lower bound binary search
                while (l < h) 
                {
                    int mid =  l + (h - l) / 2;

                    if (doubled <= numbers[mid]) 
                    {
                        h = mid;
                    } else {
                        l = mid + 1;
                    }
                }

                int removedSofar = i + (n - l);
                minRemoves = (removedSofar < minRemoves) ? removedSofar : minRemoves;
            }

            System.out.println(minRemoves);
		}
		
		bi.close();
    }
}
