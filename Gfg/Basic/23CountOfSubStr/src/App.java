import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/substrings-with-similar-first-and-last-characters/0
// Execution Time:0.2

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            
            char input[] = sc.next().toCharArray();

            int count = 0;
            int array[] = new int[26];

            for (int i = 0; i < n; i++) 
            {
                array[(int)input[i] - (int)'a'] += 1;
                count += array[(int)input[i] - (int)'a'];    
            }

            System.out.println(count);
		}
		
		sc.close();
    }
}
