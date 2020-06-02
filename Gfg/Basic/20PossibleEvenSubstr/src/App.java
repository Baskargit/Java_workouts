import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/count-even-substrings/0
// Execution Time:0.26

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String string = sc.nextLine();

            int evenCount = 0;
            
            for (int i = 0; i < string.length(); i++) 
            {
                for (int j = i+1; j < string.length() + 1; j++) 
                {
                    String subString = string.substring(i, j);
                    int number = subString.charAt(subString.length() - 1) - '0';

                    evenCount = (number % 2 == 0) ? evenCount+1 : evenCount;
                }
            }

            System.out.println(evenCount);
		}
		
		sc.close();
    }
}
