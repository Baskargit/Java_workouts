import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum/0
// Execution Time:0.34

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
		
		int testcasecount = scanner.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = scanner.nextInt();
            int sum = scanner.nextInt();

            int numbers[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = scanner.nextInt();
            }

            // Step 2 => Compute count
            int count = 0;

            for (int i = 0; i < n; i++) 
            {                
                for (int j = i+1; j < n; j++) 
                {
                    if (numbers[i] + numbers[j] == sum) 
                    {
                        count++;
                    }
                }
            }

            // Step 3 => print output
            System.out.println(count);
		}
		
		scanner.close();
    }
}

/**
Input:
49 50
48 24 99 51 33 39 29 83 74 72 22 46 40 51 67 37 78 76 26 28 76 25 10 65 64 47 34 88 26 49 86 73 73 36 75 5 26 4 39 99 27 12 97 67 63 15 3 92 90

Its Correct output is:
7

And Your Code's output is:
8

48 24 33 39 29 22 46 40 37 26 28 25 10 47 34 26 49 36 5 26 4 39 27 12 15 3
*/