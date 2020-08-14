public class App {
    public static void main(String[] args) throws Exception 
    {
        // int mat[][] = { {1,2,3}, {4,5,6}, {7,8,9}};
        int mat[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        // int mat[][] = { {1,2}, {3,4}};
        printMatrixDiagonal(mat, mat.length);
        System.out.println();
    }

    public static void printMatrixDiagonal(int mat[][], int n)
    {
        int length = n + n - 1;
        int startI = 0,startJ =  n - 1;
        int endI = 0,endJ = 0;
        
        for (int i = 0; i < length; i++) 
        {
            if (i < length) 
            { 
                int itemp = startI,jtemp = endJ;

                do 
                {
                    System.out.print(mat[itemp--][jtemp++] + " ");
                }
                while (itemp != endI && jtemp != endJ);

                startI++;endJ++;
            } 
            else 
            {
                startJ++;endI++;
            }

            System.out.println();
        }

        // print(mat, 0, 0, false);
        // print1(mat, 0, 0, 0, 0, false);
    }

    
    public static void print(int mat[][],int i,int j,boolean isUp)
    {
        if (i < mat.length && j < mat[0].length) 
        {
            if (i == 0 && j != mat.length - 1) 
            {
                System.out.print(mat[i][j] + " ");

                if (j + 1 < mat[0].length) 
                {
                    System.out.print(mat[i][j+1] + " ");
                    print(mat, i+1, j, false);
                }
                else
                {
                    print(mat, i+1, j-1, false);
                }
            }
            else if (j == 0) 
            {
                System.out.print(mat[i][j] + " ");

                if (i + 1 < mat.length)
                {
                    System.out.print(mat[i+1][j] + " ");
                    print(mat, i, j+1, true);
                }
                else
                {
                    print(mat, i, j+1, true);
                }
            }
            else if (j == mat.length - 1) 
            {
                System.out.print(mat[i][j] + " ");

                if (i + 1 < mat.length) 
                {
                    System.out.print(mat[i+1][j] + " ");
                    print(mat, i+2, j-1, false);
                }
                else
                {
                    print(mat, i+1, j+1, true);
                }
            }
            else if (i == mat.length - 1) 
            {
                System.out.print(mat[i][j] + " ");
                print(mat, i-1, j+2, true);
            }
            else
            {
                if (isUp) 
                {
                    System.out.print(mat[i][j] + " ");
                    print(mat, i-1, j+1, true);    
                }
                else
                {
                    System.out.print(mat[i][j] + " ");
                    print(mat, i+1, j-1, false);
                }
            }
        }
    }

    // Half implemented function
    public static void print1(int mat[][],int row,int col,int i,int j,boolean isUp)
    {
        if (row < mat.length) 
        {
            if (i >=0 && j < mat[0].length) 
            {
                System.out.print(mat[i][j]);
                print1(mat, row, col, i-1, j+1, isUp);
            }
            else
            {
                if (row + 1 < mat.length) 
                {
                    print1(mat, row+1, col, row+1, 0, false);
                }
                else
                {
                    print1(mat, row+1, col, row+1, 0, false);
                }
            }
        }
        else
        {
            if (col < mat[0].length) 
            {
                if (i >=0 && j < mat[0].length) 
                {
                    System.out.print(mat[i][j]);
                    print1(mat, row, col, i-1, j+1, isUp);
                }
            }
        }
    }

}
