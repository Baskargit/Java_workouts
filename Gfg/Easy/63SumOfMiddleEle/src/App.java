import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays/0
// Execution Time:0.35

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
			int n = Integer.parseInt(bi.readLine().trim());
			n += n;
			
			String string[] = (bi.readLine().trim() + " " + bi.readLine().trim()).split(" ");

			int numbers[] = new int[n];

			for (int i = 0; i < string.length; i++) 
			{
				numbers[i] = Integer.parseInt(string[i]);
			}

			Arrays.sort(numbers);

			System.out.println((n % 2 == 0) ? (numbers[n/2] + numbers[(n/2) - 1]) : numbers[n/2]);
		}
		
		bi.close();
    }
}
