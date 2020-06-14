import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/red-or-green/0
// Execution Time:0.31

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            
            String inputString = sc.next();

            long redCount = inputString.chars().filter(x -> x == 'R').count();
            long greenCount = inputString.chars().filter(x -> x == 'G').count();

            System.out.println((redCount > greenCount) ? greenCount : redCount);
		}
		
		sc.close();
    }
}
