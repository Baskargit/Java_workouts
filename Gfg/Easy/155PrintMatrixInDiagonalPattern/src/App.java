// https://practice.geeksforgeeks.org/problems/print-matrix-in-diagonal-pattern/1
// Execution Time:0.8

public class App {
    public static void main(String[] args) throws Exception 
    {
        int mat[][] = { {1,2,3}, {4,5,6}, {7,8,9}};
        //int mat[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        //int mat[][] = { {1,2}, {3,4}};
        printMatrixDiagonal(mat, mat.length);
        System.out.println();
    }

    public static void printMatrixDiagonal(int mat[][], int n)
    {
        int length = n + n - 1;
        boolean isUp = true;

        for (int i = 0; i < length; i++) 
        {
            int limitI,fromJ;
            limitI = fromJ = (i < n) ? 0 : ((i - n) + 1);

            int limitJ,fromI;
            limitJ = fromI = (i < n) ? i : n - 1;

            if (isUp) 
            {
                while (fromI != limitI && fromJ != limitJ) 
                {
                    System.out.print(mat[fromI--][fromJ++] + " ");
                }
            }
            else
            {
                while (limitI != fromI && limitJ  != fromJ) 
                {
                    System.out.print(mat[limitI++][limitJ--] + " ");
                }
            }

            System.out.print(mat[fromI][fromJ] + " ");

            isUp = !isUp;
        }
    }

}
