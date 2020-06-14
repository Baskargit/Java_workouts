import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/pairs-with-difference-k/0/
//  

public class App {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            int k = sc.nextInt();

            int array[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                array[i] = sc.nextInt();
            }
            
            int counter = 0;
            for (int i = 0; i < n; i++) 
            {
                for (int j = i + 1; j < n; j++) 
                {
                    counter += (Math.abs(array[i] - array[j]) == k) ? 1 : 0;
                }
            }

            System.out.println(counter);
		}
		
		sc.close();
    }
}
