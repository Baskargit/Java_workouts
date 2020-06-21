import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/replace-by-x/0
// Execution Time:0.2

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String string = bi.readLine();
            String replace = bi.readLine();
                        
            string = string.replaceAll(replace, "X");

            char array[] = string.toCharArray();

            char preChar = '\0';
            for (int i = 0; i < string.length(); i++) 
            {
                if (preChar == 'X' && array[i] == 'X') 
                {
                    preChar = array[i];
                }
                else if(array[i] != 'X')
                {
                    System.out.print(array[i]);
                    preChar = array[i];
                }
                else
                {
                    System.out.print(array[i]);
                    preChar = array[i]; 
                }
            }

            System.out.println();
		}
		
		bi.close();
    }
}
