import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/keypad-typing/0
// Execution Time:3.88

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String string = sc.next();

            int arr[] = new int[]{2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
            
            for (int i = 0; i < string.length(); i++) 
            {
                int index = string.charAt(i) - 'a';

                if (index >= 0 && index < 26) {
                    System.out.print(arr[index]);
                } else {
                    System.out.print(string.charAt(i));
                }
            }

            System.out.println();
		}
		
		sc.close();
    }
}
