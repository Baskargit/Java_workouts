import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/count-the-reversals/0
// Execution Time:0.17

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String expression = bi.readLine().trim();
            
            Stack<Character> stack = new Stack<Character>();

            int reversalRequired = -1;

            if (expression.length() % 2 == 0) 
            {
                for (int i = 0; i < expression.length(); i++) 
                {
                    char ch = expression.charAt(i);

                    if (ch == '{')
                    {
                        stack.push(ch);
                    }
                    else
                    {
                        if (!stack.isEmpty() && stack.peek() == '{') 
                        {
                            stack.pop();    
                        }
                        else
                        {
                            stack.push(ch);
                        }
                    }
                }

                if (stack.size() % 2 == 0) 
                {
                    int m = 0,n = 0;

                    while (!stack.isEmpty()) 
                    {                        
                        if (stack.pop() == '{') { m++; } else { n++; }
                    }

                    reversalRequired = (int)(Math.ceil(m/2.0) + Math.ceil(n/2.0));
                }
            }
            
            System.out.println(reversalRequired);
		}
		
		bi.close();
    }
}
