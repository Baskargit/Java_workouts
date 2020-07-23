import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/string-palindromic-ignoring-spaces/0
// Execution Time:0.11

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char input[] = bi.readLine().toCharArray();
            
            boolean isPalindromic = true;

            for (int front = 0,rear = input.length - 1; front < rear && rear > front;) 
            {
                if (Character.isAlphabetic(input[front]) && Character.isAlphabetic(input[rear])) 
                {
                    if (input[front] == input[rear]) {
                        front++; rear--;
                    }
                    else
                    {
                        isPalindromic = false;
                        break;
                    }
                }
                else
                {
                    if (!Character.isAlphabetic(input[front])) {
                        front++;
                    } else {
                        rear--;
                    }
                }
            }

            System.out.println(isPalindromic ? "YES" : "NO");
		}
		
		bi.close();
    }
}
