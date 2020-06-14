import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/karatsuba-algorithm/0
// Execution Time:0.33 

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
        sc.nextLine();
        
		while(testcasecount-- > 0)
		{
            String binary[] = sc.nextLine().split(" ");
            
            int num1 = Integer.parseInt(binary[0],2),num2 = Integer.parseInt(binary[1],2);

            System.out.println(num1*num2);
		}
		
		sc.close();
    }
}
