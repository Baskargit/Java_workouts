import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char input[] = bi.readLine().toCharArray();
            
            Stack<Character> stack = new Stack<Character>();

            int longestLength = 0;
            for (int i = 0; i < input.length; i++) 
            {
                if (input[i] == '(') 
                {
                    stack.push(input[i]);
                }
                else {
                    stack.pe
                    if (stack.size() > 0) {
                        longestLength += 2;
                        stack.pop();
                    }
                }
            }

            System.out.println(longestLength);
		}
		
		bi.close();
    }
}
