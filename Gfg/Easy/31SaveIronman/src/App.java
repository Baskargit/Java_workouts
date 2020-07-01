import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/save-ironman/0
// Execution Time:0.55

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char array[] = bi.readLine().trim().toLowerCase().toCharArray();

            StringBuilder stringBuilder = new StringBuilder();
            
            for (int i = 0; i < array.length; i++) 
            {
                if (Character.isLetterOrDigit(array[i])) 
                {
                    stringBuilder.append(array[i]);    
                }
            }

            System.out.println((stringBuilder.toString().equals(stringBuilder.reverse().toString())) ? "YES" : "NO");
		}
		
		bi.close();
    }
}
