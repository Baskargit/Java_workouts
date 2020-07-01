import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/buildings-receiving-sunlight/0/
// Execution Time:0.17

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine());

            String numbers[] = bi.readLine().trim().split(" ");
            
            int count = 0;
            int height = 0;

            for (int i = 0; i < n; i++) 
            {
                int tempHeight = Integer.parseInt(numbers[i]);

                if (tempHeight >= height) {
                    height = tempHeight;
                    count++;
                }
            }

            System.out.println(count);
		}
		
		bi.close();
    }
}

/**
Input:
84
87 78 16 94 36 87 93 50 22 63 28 91 60 64 27 41 27 73 37 12 69 68 30 83 31 63 24 68 36 30 3 23 59 70 68 94 57 12 43 30 74 22 20 85 38 99 25 16 71 14 27 92 81 57 74 63 71 97 82 6 26 85 28 37 6 47 30 14 58 25 96 83 46 15 68 35 65 44 51 88 9 77 79 89

Its Correct output is:
4

And Your Code's output is:
3
 */
