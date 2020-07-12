import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
// Unsolved

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String ns[] = bi.readLine().trim().split(" ");
            
            int n = Integer.parseInt(ns[0]);
            int s = Integer.parseInt(ns[1]);

            String string[] = bi.readLine().trim().split(" ");

            int numbers[] = new int[n];

            boolean isFound = false;
            int start = -1,end = -1;

            for(int i = 0; i < n; i++)
            {
                numbers[i] = Integer.parseInt(string[i]);
            }

            int front = 0, rear = 0,sum = 0;
            while (rear <= n) 
            {
                if (sum > s) 
                {
                    sum -= numbers[front++];
                }

                if (sum < s)
                {
                    sum += numbers[rear++];
                }

                if (sum == s) 
                {
                    isFound = true;
                    start = front + 1;end = rear;
                    break;
                }
            }

            System.out.println(isFound ? start + " " + end : -1);
		}
		
		bi.close();
    }
}

/**
 * 
Input:
42 468
135 101 170 125 79 159 163 65 106 146 82 28 162 92 196 143 28 37 192 5 103 154 93 183 22 117 119 96 48 127 172 139 70 113 68 100 36 95 104 12 123 134

Its Correct output is:
38 42

And Your Code's output is:
-1

Input:
57 1562
28 68 142 130 41 14 175 2 78 16 84 14 193 25 2 193 160 71 29 28 85 76 187 99 171 88 48 5 104 22 64 107 164 11 172 90 41 165 143 20 114 192 105 19 33 151 6 176 140 104 23 99 48 185 49 172 65

Its Correct output is:
20 37

And Your Code's output is:
-1

 */