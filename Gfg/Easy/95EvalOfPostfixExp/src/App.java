import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression/0
// Execution Time:0.15

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String experssion = bi.readLine().trim();
            
            Stack<Integer> stack = new Stack<Integer>();

            for (int i = 0; i < experssion.length(); i++) 
            {
                char ch = experssion.charAt(i);

                if (Character.isDigit(ch)) 
                {
                    int digit = Integer.parseInt(Character.toString(ch));
                    stack.push(digit);
                }
                else
                {
                    int rightOperand = stack.pop();
                    int leftOperand = stack.pop();
                    int res = 0;

                    switch (ch) 
                    {
                        case '+':
                            res = leftOperand + rightOperand;
                            break;

                        case '-':
                            res = leftOperand - rightOperand;
                            break;

                        case '*':
                            res = leftOperand * rightOperand;
                            break;

                        case '/':
                            res = leftOperand / rightOperand;
                            break;
                    
                        default:
                            break;
                    }

                    stack.push(res);
                }
            }

            System.out.println(stack.pop());
		}
		
		bi.close();
    }
}
