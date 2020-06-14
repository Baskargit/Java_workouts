import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/binary-string/0
// Execution Time:0.4

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            String binaryString = sc.next();
            int length = binaryString.length();
            
            int count = 0;

            for (int i = 0; i < length; i++) 
            {
                if (binaryString.charAt(i) == '1') 
                {
                    for (int j = i + 1; j < length; j++) 
                    {
                        count += (binaryString.charAt(j) == '1') ? 1 : 0;
                    }
                }    
            }

            System.out.println(count);
		}
		
		sc.close();
    }
}
