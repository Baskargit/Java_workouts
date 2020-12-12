import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception 
    {
        int n = 3;

        Stack<Integer> rod1 = new Stack<Integer>();
        for (int i = n; i >= 1; i--) 
        {
            rod1.push(i);
        }

        Stack<Integer> rod2 = new Stack<Integer>();
        Stack<Integer> rod3 = new Stack<Integer>();

        TowerOfHanoi(n, rod1, rod2, rod3);
    }

    public static void TowerOfHanoi(int n,Stack<Integer> rod1,Stack<Integer> rod2,Stack<Integer> rod3)
    {
        if (rod3.size() != n) 
        {
            PrintRod(rod1, 'A');
            PrintRod(rod2, 'B');
            PrintRod(rod3, 'C');

            

            return;
        }
    }

    public static void PrintRod(Stack<Integer> rod,char rodName)
    {
        System.out.print(rodName + " : ");

        for (Integer integer : rod) 
        {
            System.out.print(integer + " ");
        }

        System.out.println();
    }
}
