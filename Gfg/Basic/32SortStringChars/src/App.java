import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/sort-the-string-in-descending-order/0/
// 

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String string = sc.next();

            int[] charCount = new int[26];
            
            for (int i = 0; i < string.length(); i++) 
            {
                charCount[string.charAt(i) - 'a'] += 1;    
            }

            for (int i = 25; i >= 0; i--) 
            {
                for (int j = 1; j <= charCount[i]; j++) 
                {
                    System.out.print((char)(i + 'a'));
                }  
            }
            
            System.out.println();
		}
		
		sc.close();
    }
}
