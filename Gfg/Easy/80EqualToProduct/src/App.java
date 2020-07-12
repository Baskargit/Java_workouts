import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/equal-to-product/0
// Runtime Exception

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String np[] = bi.readLine().trim().split(" ");
            
            int n = Integer.parseInt(np[0]);
            BigInteger p = new BigInteger(np[1]);

            String string[] = bi.readLine().trim().split(" ");

            BigInteger numbers[] = new BigInteger[n];

            boolean isPairFound = false;

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = new BigInteger(string[i]);
            }

            Arrays.sort(numbers);

            int rear = n - 1;

            for (int front = 0; front < rear;) 
            {
                BigInteger res = numbers[front].multiply(numbers[rear]);

                if (res.compareTo(p) < 0) {
                    front++;
                }
                else if (res.compareTo(p) > 0) {
                    rear--;
                }
                else
                {
                    isPairFound = true;
                    break;
                }
            }

            System.out.println(isPairFound ? "Yes" : "No");
		}
		
		bi.close();
    }
}
