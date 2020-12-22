import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/max-rectangle/1/?difficulty[]=1&page=3&query=difficulty[]1page3
// Execution Time:3.33 seconds
// 8:10 - 11:41

// Expected Time Complexity : O(n*m) => not met
// Expected Auixiliary Space : O(m) => not met

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int M[][] = new int[m][n];

        System.out.println();
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                M[i][j] = scanner.nextInt();
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        scanner.close();

        // int M[][] = new int[][] {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        // int m = M.length;
        // int n = M[0].length;

        System.out.println(maxArea(M,m,n));
    }

    public static int maxArea(int M[][], int m, int n) 
    {
        int maxArea = 0;

        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                if (M[i][j] != 0) 
                {
                    // Findout the max possible range first
                    int iRange = i, jRange = j;

                    for (int i1 = i; i1 < m; i1++) 
                    {
                        if (M[i1][j] != 0) {
                            iRange++;    
                        } else {
                            break;
                        }
                    }

                    for (int j1 = j; j1 < n; j1++)
                    {
                        if (M[i][j1] != 0) {
                            jRange++;    
                        } else {
                            break;
                        }
                    }

                    // Get maxArea out of the possible maximum range
                    int tempArea = length(m, n, i, j, M, iRange, jRange);

                    maxArea = (tempArea > maxArea) ? tempArea : maxArea;
                }
            }
        }

        System.out.println();

        return maxArea;
    }

    public static int length(int m, int n,int i, int j,int M[][],int iRange,int jRange)
    {
        int iRangeArea = iRange - i,jRangeArea = jRange - j;
        int tempArea = (iRangeArea > jRangeArea) ? iRangeArea : jRangeArea;

        boolean flag = true;

        for (int i1 = i; i1 < iRange; i1++) 
        {
            for (int j1 = j; j1 < jRange; j1++)
            {
                if (M[i1][j1] == 0) 
                {
                    flag = false;
                    i1 = m + 1;
                    break;
                }
            }
        }

        if (flag) 
        {
            // No zeros found so consider whole sub-matrix
            tempArea = (iRange - i) * (jRange - j);
        }
        else
        {
            // Zero found inbetween matrix
            // MaxOf((From the current range ignore last row and calculate maxArea), (From the current range ignore last column and calculate maxArea))
            tempArea = Math.max(tempArea,Math.max(length(m, n, i, j, M, iRange - 1, jRange),length(m, n, i, j, M, iRange, jRange - 1)));
        }

        System.out.print(tempArea + " ");

        return tempArea;
    }
}

/**

Input:
8 17
1 0 0 1 0 0 1 0 0 1 1 0 1 0 1 0 1 1 1 0 1 1 0 1 1 0 1 1 1 0 1 0 0 1 1 1 1 1 1 0 0 1 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 1 1 0 1 1 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0 0 1 1 1 1 1 0 0 0 1 0 1 0 1 1 0 0 0 1 1 1 1 0 0 0 1 0 1 1 1 0 1 0 0 0 1 0 0 0 1 1 1 1 1 1 1 1 1 1 1 0 1 0 0 0 0 0 1 0

Its Correct output is:
8

And Your Code's output is:
5

Input:
15 3
0 0 1 1 0 1 0 1 1 0 0 0 0 0 0 1 1 0 1 1 0 1 1 0 1 0 0 1 0 0 1 1 0 1 1 1 1 0 1 0 1 1 1 0 1

Its Correct output is:
8

And Your Code's output is:
6

Input:
18 14
1 1 0 1 0 0 0 0 0 0 1 0 0 0 0 0 1 1 0 1 1 1 1 1 1 0 1 0 1 0 0 1 1 0 0 1 0 0 1 0 1 1 0 1 0 1 0 1 0 1 0 1 0 0 1 1 1 0 0 0 0 0 0 0 0 1 0 0 1 0 1 0 0 1 0 0 0 0 0 0 0 1 0 0 0 0 1 1 0 0 0 1 1 0 0 1 1 0 0 1 0 1 1 1 0 1 0 0 1 1 1 1 1 1 1 1 0 0 1 1 1 0 1 1 1 0 0 1 1 1 0 0 1 0 0 0 1 1 1 0 0 0 0 0 1 0 1 0 0 1 0 0 0 0 0 1 0 0 0 0 0 1 1 1 1 1 1 0 0 1 1 0 1 0 1 1 1 0 1 0 0 1 1 1 1 0 0 0 0 0 1 1 1 1 1 1 0 0 1 1 1 0 1 1 0 1 1 0 0 1 0 0 0 0 1 1 0 1 0 0 1 1 0 1 1 1 1 1 1 1 1 1 0 1 1 0 0 0 0 1 0 0 0 0 0 1 1 0 1 0 1 0

Its Correct output is:
9

And Your Code's output is:
8

*/