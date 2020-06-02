import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/the-penalty-shootout/0
// Execution Time:0.17

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String inputString = sc.nextLine();
            
            int goalCount = 0;

            for (int i = 0; i < inputString.length(); i++) 
            {
                goalCount += (inputString.charAt(i) == '2') ? (inputString.charAt(i+1) == '1') ? 1 : 0 : 0;
            }

            System.out.println(goalCount);
		}
		
		sc.close();
    }
}
