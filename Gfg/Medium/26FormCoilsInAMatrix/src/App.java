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
            int n = Integer.parseInt(bi.readLine().trim());
            
            int matrix[][] = new int[4*n][4*n];

            int val = 1;

            for (int i = 0; i < matrix.length; i++) 
            {
                for (int j = 0; j < matrix.length; j++) 
                {
                    matrix[i][j] = val++;
                }    
            }

            printMatrix(matrix);

            // int c1I = (n * 4) - 2,c1J = (n * 2) - 1;
            // int c2I = 1,c2J = 2 * n;

            int c1I = (n * 2),c1J = (n * 2) - 1;
            int c2I = c1J,c2J = c1I;

            Coil1(matrix, c1I, c1J,true,false,false);

            System.out.println();

            Coil2(matrix, c2I, c2J, true, false, false);

            System.out.println();
		}
		
		bi.close();
    }

    public static void Coil2(int matrix[][],int c2I,int c2J,boolean isDown,boolean isLeft,boolean isUp)
    {
        if ((c2I >= 0 && c2I < matrix.length) && (c2J >= 0 && c2J < matrix.length)) 
        {
            System.out.print(matrix[c2I][c2J] + " ");

            if (isDown) 
            {
                Coil2(matrix, c2I + 1, c2J, true, false, false);
            }
            else if (isLeft) 
            {
                Coil2(matrix, c2I, c2J - 1, false, true, false);
            }
            else
            {
                Coil2(matrix, c2I - 1, 0, false, false, true);
            }
        }
        else
        {
            if (c2I >= matrix.length) 
            {
                Coil2(matrix, c2I - 1, c2J - 1, false, true, false);  // Left  
            }
            else if (c2J < 0) 
            {
                Coil2(matrix, c2I - 1, 0, false, false, true); // Up
            }
            else
            {
                return;
            }
        }
    }

    public static void Coil1(int matrix[][],int c1I,int c1J,boolean isUp,boolean isRight,boolean isDown)
    {
        if ((c1I >= 0 && c1I < matrix.length) && (c1J >= 0 && c1J < matrix.length)) 
        {
            System.out.print(matrix[c1I][c1J] + " ");

            if (isUp) 
            {
                Coil1(matrix, c1I - 1, c1J, true, false, false);
            }
            else if (isRight) 
            {
                Coil1(matrix, c1I, c1J + 1, false, true, false);
            }
            else
            {
                Coil1(matrix, c1I + 1, c1J, false, false, true);
            }
        }
        else
        {
            if (c1I < 0) 
            {
                Coil1(matrix, c1I + 1, c1J + 1, false, true, false); // Right
            }
            else if (c1J >= matrix.length) 
            {
                Coil1(matrix, c1I + 1, c1J - 1, false, false, true); // Down
            }
            else
            {
                return;
            }
        }
    }

    public static void printMatrix(int matrix[][])
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix.length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

}

/*

Input:
2

Its Correct output is:
36 28 20 21 22 30 38 46 54 53 52 51 50 42 34 26 18 10 2 3 4 5 6 7 8 16 24 32 40 48 56 64
29 37 45 44 43 35 27 19 11 12 13 14 15 23 31 39 47 55 63 62 61 60 59 58 57 49 41 33 25 17 9 1

And Your Code's output is:
36 28 20 12 4 5 6 7 8 16 24 32 40 48 56 64
29 37 45 53 61 60 59 58 57 49 41 33 25 17 9 1

*/
