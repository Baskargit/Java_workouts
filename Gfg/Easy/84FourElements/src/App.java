import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/four-elements/0
// Unsolved

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int x = Integer.parseInt(bi.readLine().trim());

            int numbers[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);    
            }

            Arrays.sort(numbers);

            int result = 0;

            if (n >= 4) 
            {
                int rear = n -1;

                for (int front = 0; front + 2 < rear;) 
                {
                    int sum = numbers[front] + numbers[front + 1] + numbers[front + 2] + numbers[rear];

                    if (sum < x) {
                        front++;
                    }
                    else if (sum > x) {
                        rear--;
                    }
                    else
                    {
                        result = 1;
                        break;
                    }
                }

                rear = n - 1;
                for (int front = 0; rear - 2 > front;) 
                {
                    int sum = numbers[rear] + numbers[rear - 1] + numbers[rear - 2] + numbers[front];

                    if (sum < x) {
                        front++;
                    }
                    else if (sum > x) {
                        rear--;
                    }
                    else
                    {
                        result = 1;
                        break;
                    }
                }
            }

            System.out.println(result);
		}
		
		bi.close();
    }
}

/**
Input:
19
6 33 23 33 18 31 44 25 27 44 37 4 44 25 15 14 30 28 13
76

Its Correct output is:
1

And Your Code's output is:
0
 */
