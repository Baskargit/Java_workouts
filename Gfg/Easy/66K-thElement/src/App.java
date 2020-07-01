import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array/0
// Execution Time:0.87

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String nmk[] = bi.readLine().trim().split(" ");
            
            int k = Integer.parseInt(nmk[2]) - 1;

            String string[] = (bi.readLine().trim() + " " + bi.readLine().trim()).split(" ");

            int numbers[] = new int[string.length];

            for (int i = 0; i < numbers.length; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);
            }

            Arrays.sort(numbers);

            System.out.println(numbers[k]);
		}
		
		bi.close();
    }
}
