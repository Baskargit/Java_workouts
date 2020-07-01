import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
// Execution Time:0.29

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            char values[] = bi.readLine().trim().toCharArray();

            StringBuilder zeros = new StringBuilder();
            StringBuilder ones = new StringBuilder();
            StringBuilder twos = new StringBuilder();

            for (int i = 0; i < values.length; i++) 
            {
                if (values[i] == '0') {
                    zeros.append("0 ");
                }
                else if (values[i] == '1') {
                    ones.append("1 ");
                }
                else if (values[i] == '2') {
                    twos.append("2 ");
                }
            }

            System.out.println(zeros.toString() + ones.toString() + twos.toString().trim());
		}
		
		bi.close();
    }
}
