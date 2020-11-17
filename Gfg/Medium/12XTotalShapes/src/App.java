// https://practice.geeksforgeeks.org/problems/x-total-shapes3617/1/?difficulty[]=1&page=1&query=difficulty[]1page1
// Execution Time:0.43

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // String arr[] = {"OOOOXXO","OXOXOOX","XXXXOXO","OXXXOOO"};
        // int n = 4, m = 7;

        String arr[] = {"XXO","OOX","OXO","OOO","XOX","XOX","OXO","XXO","XXX","OOO"};
        int n = 10, m = 3;

        System.out.println(Shape(arr, n, m));
    }

    public static int Shape(String []arr,int n,int m)
    {
        int shapeGroups = 0;

        // Step 1 Set data in a proper format
        char matrix[][] = new char[n][m];
        boolean traversed[][] = new boolean[n][m];

        for (int i = 0; i < arr.length; i++) 
        {
            char data[] = arr[i].toCharArray();
            
            for (int j = 0; j < data.length; j++) 
            {
                matrix[i][j] = data[j];
                traversed[i][j] = false;
            }
        }

        // Step 2 iterate through the matrix and find out the grouped value
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                if (!traversed[i][j] && matrix[i][j] == 'X') 
                {
                    shapeGroups++;
                    find(n, m, matrix, traversed, i, j);
                }
            }    
        }

        return shapeGroups;
    }

    public static void find(int n,int m,char matrix[][], boolean traversed[][] ,int currentN,int currentM)
    {
        if (currentN < n && currentN >= 0 && currentM < m  && currentM >=0 && matrix[currentN][currentM] == 'X' && !traversed[currentN][currentM]) 
        {
            traversed[currentN][currentM] = true;

            find(n, m, matrix, traversed, currentN - 1, currentM);
            find(n, m, matrix, traversed, currentN, currentM + 1);
            find(n, m, matrix, traversed, currentN + 1, currentM);
            find(n, m, matrix, traversed, currentN, currentM - 1);
        }
    }
}
