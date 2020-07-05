import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            char array[] = bi.readLine().trim().replaceAll(" ", "").toCharArray();

            int m = Integer.parseInt(bi.readLine().trim());

            int maxLength = 0,tempLen = 0;
            int front = 0,tempZeroCount = 0;

            for (int rear = 0; rear < n; rear++) 
            {
                tempLen++;

                if (tempZeroCount > m) 
                {
                    maxLength = (tempLen > maxLength) ? tempLen : maxLength;
                    tempZeroCount = 0;
                    front = rear;
                }

                if (array[rear] == '0') 
                {
                    tempZeroCount++;    
                }
            }

            maxLength = (tempLen > maxLength) ? tempLen : maxLength;

            System.out.println(maxLength);
		}
		
		bi.close();
    }
}

/**
Input:
4
1 0 1 0
0

Its Correct output is:
1

And Your Code's output is:
0

Custom cases
4
0 0 0 0
0

4
0 0 0 0
1

4
0 0 0 1
3

4
0 0 0 1
3

Input:
15
1 0 1 1 1 1 1 0 0 1 1 0 1 1 0
1

Its Correct output is:
7

And Your Code's output is:
3
 */