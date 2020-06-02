import java.util.Arrays;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/sort-string/0
// Execution Time:0.6

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String inputString = sc.nextLine();
            
            char[] chars = inputString.toCharArray();
            Arrays.sort(chars);

            StringBuilder outpuString = new StringBuilder();

            for (char c : chars) {
                outpuString.append(c);
            }

            System.out.println(outpuString);
		}
		
		sc.close();
    }
}
