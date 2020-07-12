import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/transform-the-array/0
// Execution Time:1.01

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int numbers[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]); 
            }

            int front = 0,rear = 1;
            StringBuilder outputNum = new StringBuilder();
            StringBuilder outputZero = new StringBuilder();

            while (rear < n) 
            {
                if (numbers[rear] != 0) 
                {
                    if (numbers[front] == numbers[rear]) 
                    {
                        numbers[front] *= 2;
                        numbers[rear] = 0;

                        rear++;
                    }
                    else
                    {
                        while (numbers[++front] <= 0) { }
                        rear++;
                    }
                }
                else
                {
                    rear++;
                }
            }
            

            // Build output
            for (int i = 0; i < n; i++) 
            {
                if (numbers[i] > 0) 
                {
                    outputNum.append(numbers[i] + " ");  
                }
                else
                {
                    outputZero.append("0 ");
                }
            }

            System.out.println(outputNum.toString() + outputZero.toString());
		}
		
		bi.close();
    }
}

/**
1
20
6 7 5 3 5 6 2 9 1 2 7 0 9 3 6 0 6 2 6 1
 */
