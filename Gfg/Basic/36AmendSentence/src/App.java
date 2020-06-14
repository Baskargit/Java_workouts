import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/amend-the-sentence/0/
// Execution Time:0.39

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String string = sc.next();
            
            System.out.print(Character.toLowerCase(string.charAt(0)));

            for (int i = 1; i < string.length(); i++) 
            {
                char ch = string.charAt(i);

                if (Character.isUpperCase(ch)) 
                {
                    System.out.print(" " + Character.toLowerCase(ch));
                }
                else
                {
                    System.out.print(ch);
                }
            }

            System.out.println();
		}
		
		sc.close();
    }
}
