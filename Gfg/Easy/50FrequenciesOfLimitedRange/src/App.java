import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/frequency-of-array-elements/0
// Execution Time:1.34

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim()) + 1;
            
            String string[] = bi.readLine().trim().split(" ");

            int counter[] = new int[n];

            for (int i = 0; i < counter.length; i++) 
            {
                int num = Integer.parseInt(string[i]);
                counter[num]++;
            }

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 1; i < counter.length; i++) 
            {
                stringBuilder.append(counter[i] + " ");
            }

            System.out.println(stringBuilder.toString().trim());
		}
		
		bi.close();
    }
}
