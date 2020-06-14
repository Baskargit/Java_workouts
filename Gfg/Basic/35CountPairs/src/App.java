import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/count-pairs-in-an-array/0/
// 0.45

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            
            int array[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                array[i] = sc.nextInt();
            }
            
            int count = 0;

            for (int i = 0; i < n; i++) 
            {
                for (int j = i; j < n; j++) 
                {
                    count += (i*array[i] > j*array[j]) ? 1 : 0;
                }
            }

            System.out.println(count);
		}
		
		sc.close();
    }
}
