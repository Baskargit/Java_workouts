import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/cross-character/0
// Execution Time:0.56

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char array[] = bi.readLine().trim().toCharArray();
            
            for (int i = 0; i < array.length; i++) 
            {
                for (int j = 0; j < array.length; j++) 
                {
                    System.out.print((i == j || j == (array.length - 1) - i) ? array[j] : ' ');
                }
            }

            System.out.println();
		}
		
		bi.close();
    }
}
