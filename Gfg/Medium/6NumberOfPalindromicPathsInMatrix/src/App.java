import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/number-of-palindromic-paths-in-a-matrix/0
// Execution Time:0.33

public class App 
{
    public static long counter = 0;
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String rc[] = bi.readLine().trim().split(" ");
            int r = Integer.parseInt(rc[0]);
            int c = Integer.parseInt(rc[1]);

            char input[] = bi.readLine().trim().replace(" ", "").toCharArray(); 

            char matrix[][] = new char[r][c];

            for (int i = 0,counter = 0; i < r; i++) 
            {
                for (int j = 0; j < c; j++) 
                {
                    matrix[i][j] = input[counter++];
                }
            }

            FindPalindrmicPaths(matrix, 0, 0,new StringBuilder());

            System.out.println(counter);
            counter = 0;
		}
		
		bi.close();
    }

    public static void FindPalindrmicPaths(char matrix[][],int i,int j,StringBuilder string)
    {
        if (i >= matrix.length || j >= matrix[0].length) 
        {
            return;
        }
        else
        {
            if (i == matrix.length - 1 && j == matrix[0].length - 1) 
            {
                string.append(matrix[i][j]);
                String reversed = new StringBuilder(string.toString()).reverse().toString();
                counter += (string.toString().equals(reversed)) ? 1 : 0;
                string.setLength(string.length() - 1);
            }

            FindPalindrmicPaths(matrix, i, j+1, string.append(matrix[i][j])); // Right
            string.setLength(string.length() - 1);
            
            FindPalindrmicPaths(matrix, i+1, j, string.append(matrix[i][j])); // Down
            string.setLength(string.length() - 1);
        }
    }
}
