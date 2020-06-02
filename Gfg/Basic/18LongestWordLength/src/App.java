import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/program-for-length-of-the-longest-word-in-a-sentence/0/
// Exec Time : 0.16

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            // String inputString = sc.nextLine();

            // int counter = 0;
            // int maxLength = 0;
            // int length = inputString.length();

            // for (int i = 0; i < length; i++) 
            // {
            //     if (inputString.charAt(i) == ' ' || i == length - 1) 
            //     {
            //         counter = (i == length - 1) ? counter+1 : counter;
            //         maxLength = (counter > maxLength) ? counter : maxLength;
            //         counter = 0;
            //     }
            //     else
            //     {
            //         counter++;
            //     }
            // }
            
            String inputString = sc.nextLine();

            int maxLength = 0;

            String[] strings = inputString.split(" ");
            
            for (String string : strings) 
            {
                maxLength = (string.length() > maxLength) ? string.length() : maxLength;
            }

            System.out.println(maxLength);
        }
        
        sc.close();
    }
}
