import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x/0
// Execution Time:1.72

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String nms[] = bi.readLine().trim().split(" ");
            
            int n = Integer.parseInt(nms[0]);
            int m = Integer.parseInt(nms[1]);
            int s = Integer.parseInt(nms[2]);

            String nString[] = bi.readLine().trim().split(" ");
            String mString[] = bi.readLine().trim().split(" ");

            int nNumbers[] = new int[n];
            int mNumbers[] = new int[m];

            if (n == m) 
            {
                for (int i = 0; i < n; i++) 
                {
                    nNumbers[i] = Integer.parseInt(nString[i]);
                    mNumbers[i] = Integer.parseInt(mString[i]);
                }
            }
            else
            {
                for (int i = 0; i < n; i++) 
                {
                    nNumbers[i] = Integer.parseInt(nString[i]);
                }

                for (int i = 0; i < m; i++) 
                {
                    mNumbers[i] = Integer.parseInt(mString[i]);
                }
            }

            Arrays.sort(nNumbers);
            Arrays.sort(mNumbers);

            // Two-pointer technique
            String output = "";
            boolean isN = true,isM = true;
            for (int front = 0,rear = m - 1; isN || isM;)
            {
                isN = (front == n - 1) ? false : true;
                isM = (rear == 0) ? false : true;
                
                int sum = nNumbers[front] + mNumbers[rear];

                if (sum == s) 
                {
                    output += nNumbers[front] + " " + mNumbers[rear] + ", ";
                    front += (front + 1 < n) ? 1 : 0;
                    rear -= (rear - 1 >= 0) ? 1 : 0;
                }
                else if (sum > s) 
                {
                    if (rear == 0) 
                    {
                        front++;
                    }
                    else
                    {
                        rear -= (rear - 1 >= 0) ? 1 : 0;
                    }
                }
                else
                {
                    if (front == n - 1) 
                    {
                        rear--;
                    }
                    else
                    {
                        front += (front + 1 < n) ? 1 : 0;
                    }
                }
            }

            System.out.println((output.length() > 0) ? output.substring(0, output.length() - 2) : "-1");
        }
		
		bi.close();
    }
}

/**

For Input:
2
15 17 20
7 -27 -28 -32 -36 -37 -43 -51 -56 -59 -65 74 -75 -87 91
-4 6 -11 -13 18 28 -29 35 -37 -38 -40 43 58 63 -76 93 -95
2 26 97
-1 2
-4 5 -7 -11 -17 -24 25 39 42 -43 44 -48 54 55 64 69 70 -72 82 -83 -86 -88 -90 -96 97 99
Your Output is:
-1
-1

 */
