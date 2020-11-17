import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/is-sudoku-valid/0/?difficulty[]=1&page=1&query=difficulty[]1page1
// Execution Time:0.18

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int position = 0;
            char input[] = bi.readLine().replace(" ", "").toCharArray();
            
            int sudoko[][] = new int[9][9];

            for (int i = 0; i < 9; i++) 
            {
                for (int j = 0; j < 9; j++) 
                {
                    sudoko[i][j] = Integer.parseInt(Character.toString(input[position++]));
                }
            }
            
            // Naive approach
            if (Mat3x3Check(sudoko) && RowColCheck(sudoko)) 
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }

		}
		
		bi.close();
    }

    public static boolean RowColCheck(int sudoko[][])
    {
        boolean isValid = true;
        
        int count[];
        
        // Row check
        for (int i = 0; i < 9; i++) 
        {
            count = new int[10];

            for (int j = 0; j < 9; j++) 
            {
                if (sudoko[i][j] != 0) 
                {
                    if (count[sudoko[i][j]] == 0) {
                        count[sudoko[i][j]]++;
                    } else {
                        return false;
                    }
                }
            }
        }

        // Column check
        for (int i = 0; i < 9; i++) 
        {
            count = new int[10];

            for (int j = 0; j < 9; j++) 
            {
                if (sudoko[j][i] != 0) 
                {
                    if (count[sudoko[j][i]] == 0) {
                        count[sudoko[j][i]]++;
                    } else {
                        return false;
                    }
                }
            }
        }

        return isValid;
    }

    public static boolean Mat3x3Check(int sudoko[][])
    {
        int count[];

        for (int i = 0; i < 9; i = i+3) 
        {
            count = new int[10];

            for (int i1 = i; i1 < i+3; i1++) 
            {
                for (int j = 0; j < 3; j++) 
                {
                    if (sudoko[i1][j] != 0) 
                    {
                        if (count[sudoko[i1][j]] == 0) {
                            count[sudoko[i1][j]]++;
                        } else {
                            return false;
                        }
                    }
                }
            }

            count = new int[10];

            for (int i1 = i; i1 < i+3; i1++) 
            {
                for (int j = 3; j < 6; j++) 
                {
                    if (sudoko[i1][j] != 0) 
                    {
                        if (count[sudoko[i1][j]] == 0) {
                            count[sudoko[i1][j]]++;
                        } else {
                            return false;
                        }
                    }
                }
            }

            count = new int[10];

            for (int i1 = i; i1 < i+3; i1++) 
            {
                for (int j = 6; j < 9; j++) 
                {
                    if (sudoko[i1][j] != 0) 
                    {
                        if (count[sudoko[i1][j]] == 0) {
                            count[sudoko[i1][j]]++;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

}
