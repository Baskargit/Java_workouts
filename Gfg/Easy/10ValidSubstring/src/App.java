import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/valid-substring/0
// Execution Time:0.2

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char input[] = bi.readLine().toCharArray();
            
            int longestLength = 0;
            for (int i = 0; i < input.length; i++) 
            {
                int tempLen = 0;
                Stack<Character> stack = new Stack<Character>();
                stack.push(input[i]);

                for (int j = i+1; j < input.length; j++) 
                {
                    if (input[j] == '(') 
                    {
                        stack.push(input[i]);
                    }
                    else 
                    {
                        if (!stack.isEmpty() && stack.peek() == '(') 
                        {
                            stack.pop();
                            tempLen += 2;
                        }
                        else
                        {
                            stack.push(')');
                        }
                    }

                    longestLength = (stack.isEmpty() && tempLen > longestLength) ? tempLen : longestLength;
                }

                
            }

            System.out.println(longestLength);
		}
		
		bi.close();
    }
}

/*
Input:
)()()()))((((()()())(()()())(())((

Its Correct output is:
20

And Your Code's output is:
0
*/
