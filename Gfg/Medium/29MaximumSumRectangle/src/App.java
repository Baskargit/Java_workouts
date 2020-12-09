// https://practice.geeksforgeeks.org/problems/maximum-sum-rectangle/0/?difficulty[]=1&page=2&query=difficulty[]1page2
// Execution Time:0.11

// No complexity expected in the problem statement
// Can solved using Kadane's algo

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String input[] = bi.readLine().trim().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            input = bi.readLine().trim().split(" ");

            AtomicInteger maxSum = new AtomicInteger(0);

            int matrix[][] = new int[n][m];
            int pos = 0;

            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < m; j++) 
                {
                    matrix[i][j] = Integer.parseInt(input[pos++]);
                }    
            }

            System.out.println();

            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < m; j++) 
                {
                    find(matrix, n, m,i,j,maxSum);
                }

                System.out.println();
            }

            System.out.println();

            System.out.println(maxSum.get());
		}
		
		bi.close();
    }

    public static void find(int matrix[][],int n,int m,int nlimit,int mlimit,AtomicInteger maxSum)
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                if (i + nlimit < n && j + mlimit < m) 
                {
                    int tempSum = 0;

                    for (int k = i; k <= i+nlimit; k++) 
                    {
                        for (int l = j; l <= j+mlimit; l++) 
                        {
                            System.out.print(matrix[k][l] + " ");
                            tempSum += matrix[k][l];
                        }
                        System.out.println();
                    }

                    if (tempSum > maxSum.get()) 
                    {
                        maxSum.set(tempSum);    
                    }   
                    
                    System.out.println("Maxsum : " + maxSum);
                    System.out.println();
                } 
            }
            System.out.println();
        }
        System.out.println("Func end \n");
    }
}

/**
Input:
1
9 3
-10 -21 5 -15 4 13 17 -16 -4 24 0 -7 -4 -22 -6 -20 -12 -12 12 24 18 -21 7 -9 -6 24 -11

Its Correct output is:
55

And Your Code's output is:
53

*/