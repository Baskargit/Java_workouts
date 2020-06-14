import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/print-bracket-number/0
// Execution Time:0.24

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String string = bi.readLine();
            
            Stack<Integer> stack = new Stack<Integer>();

            int pushCount = 0;

            for (int i = 0; i < string.length(); i++) 
            {
                char ch = string.charAt(i);

                if (ch == '(') 
                {
                    stack.push(++pushCount);
                    System.out.print(pushCount + " ");
                } 
                else if (ch == ')') 
                {
                    System.out.print(stack.pop() + " ");
                }
            }

            System.out.println();
		}
		
		bi.close();
    }
}
