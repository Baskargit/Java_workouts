import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            
            boolean flag = true;

            while (n > 0) 
            {
                if (n % 2 == 0) {
                    flag = false;
                    break;
                }

                n /= 2;
            }

            System.out.println((flag) ? "YES" : "NO");
		}
    }
}
