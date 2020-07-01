import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/count-the-zeros/0
// Execution Time:0.16

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String array[] = bi.readLine().trim().split(" ");
            int counter = 0;

            for (int i = n - 1; i >= 0; i--) 
            {
                if (array[i].equals("1")) 
                {
                    break;    
                }
                else
                {
                    counter++;
                }
            }

            System.out.println(counter);
		}
		
		bi.close();
    }
}
