import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/find-whether-path-exist/0/
// Execution Time:0.13

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String input[] = bi.readLine().trim().split(" ");

            int matrix[][] = new int[n][n];
            int traversed[][] = new int[n][n];
            int sourceI = 0, sourceJ = 0,counter = 0;

            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    matrix[i][j] = Integer.parseInt(input[counter++]);

                    if (matrix[i][j] == 1) 
                    {
                        sourceI = i; sourceJ = j;
                    }
                }    
            }

            System.out.println(IsPathExists(matrix,traversed, sourceI, sourceJ) ? 1 : 0);
		}
		
        bi.close();
    }

    public static boolean IsPathExists(int matrix[][],int traversed[][],int i,int j)
    {
        if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length && matrix[i][j] != 0 && traversed[i][j] == 0) 
        {
            traversed[i][j] = 1; // Make the cell as a traversed one

            if (matrix[i][j] == 2) // Destination
            {
                return true;
            }
              
            return IsPathExists(matrix,traversed, i-1, j) // Up
            || IsPathExists(matrix,traversed, i, j+1) // Right
            || IsPathExists(matrix,traversed, i+1, j) // Down
            || IsPathExists(matrix,traversed, i, j-1); // Left
        }

        return false;
    }
}
