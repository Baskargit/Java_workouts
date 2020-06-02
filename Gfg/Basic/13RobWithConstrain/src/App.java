import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            int money = sc.nextInt();

            System.out.println((n % 2 == 0) ? (n/2)*money : (n/2 + 1) * money);
		}
    }
}
