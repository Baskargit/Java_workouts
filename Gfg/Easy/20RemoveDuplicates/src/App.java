import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/remove-duplicates/0
// Execution Time:0.15

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char input[] = bi.readLine().toCharArray();
            
            int counter[] = new int[256];

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < input.length; i++) 
            {
                if (counter[input[i]] == 0) 
                {
                    counter[input[i]] = 1;
                    stringBuilder.append(input[i]);    
                }
                else
                {
                    counter[input[i]]++;
                }
            }

            System.out.println(stringBuilder.toString());
		}
		
		bi.close();
    }
}
