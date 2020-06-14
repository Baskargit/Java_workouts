import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/remove-character/0
// Execution Time:0.14

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            String s1 = sc.next();
            String s2 = sc.next();

            for (int i = 0; i < s2.length(); i++) 
            {
                s1 = s1.replace(Character.toString(s2.charAt(i)), "");
            }
            
            System.out.println(s1);
		}
		
		sc.close();
    }
}
