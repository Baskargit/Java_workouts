import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            String input[] = bi.readLine().trim().split(" ");
            int k = Integer.parseInt(bi.readLine().trim());

            int numbers[] = new int[n];

            for (int i = 0; i < input.length; i++) 
            {
                numbers[i] = Integer.parseInt(input[i]);
            }

            Arrays.sort(numbers);

            System.out.println(numbers[k - 1]);
		}
		
		bi.close();
    }
}
