import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/even-and-odd-elements-at-even-and-odd-positions/0
// Execution Time:0.5

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

            int even[] = new int[n];
            int odd[] = new int[n];
            int evenCounter = 0,oddCounter = 0;

            for (int i = 0; i < n; i++) 
            {
                int num = Integer.parseInt(string[i]);

                if (num % 2 == 0) 
                {
                    even[evenCounter++] = num;
                }
                else
                {
                    odd[oddCounter++] = num;
                }
            }

            if (evenCounter != n && oddCounter != n) 
            {
                int tempEvenCounter = 0,tempOddCounter = 0;

                boolean isEvenPos = true;

                for (int i = 0; i < n; i++) 
                {
                    numbers[i] = (isEvenPos) 
                                ? (tempEvenCounter < evenCounter) ? even[tempEvenCounter++] : odd[tempOddCounter++] 
                                : (tempOddCounter < oddCounter) ? odd[tempOddCounter++] : even[tempEvenCounter++];
                    
                    isEvenPos = !isEvenPos;
                }
            }
            else if (evenCounter == n) 
            {
                numbers = even;
            }
            else
            {
                numbers = odd;
            }

            StringBuilder output = new StringBuilder();

            for (int i = 0; i < n; i++) 
            {
                output.append(numbers[i] + " ");
            }

            System.out.println(output.toString());
		}
		
		bi.close();
    }
}
