import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/addition-of-submatrix/0
// Execution Time:0.16

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String nm[] = bi.readLine().trim().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            String values[] = bi.readLine().trim().split(" ");
            String xy[] = bi.readLine().trim().split(" ");

            int x1 = Integer.parseInt(xy[0]) - 1,y1 = Integer.parseInt(xy[1]) - 1;
            int x2 = Integer.parseInt(xy[2]) - 1,y2 = Integer.parseInt(xy[3]) - 1;
            int counter = 0;

            int matrix[][] = new int[n][m];
            int sum = 0;

            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < m; j++) 
                {
                    matrix[i][j] = Integer.parseInt(values[counter++]);

                    if (i >= x1 && i <= x2 && j >= y1 && j <= y2) 
                    {
                        sum += matrix[i][j];   
                    }
                }    
            }

            System.out.println(sum);
		}
		
		bi.close();
    }
}
