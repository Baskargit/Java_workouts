import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String input[] = bi.readLine().trim().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            input = bi.readLine().trim().split(" ");

            int matrix[][] = new int[n][m];
            int pos = 0;

            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < m; j++) 
                {
                    matrix[i][j] = Integer.parseInt(input[pos++]);
                }    
            }

		}
		
		bi.close();
    }
}
