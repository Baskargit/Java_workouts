import java.util.HashMap;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string/0
// Execution Time:0.27

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String inputString = sc.next();
            
            StringBuilder output = new StringBuilder();

            HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();

            for (int i = 0; i < inputString.length(); i++) 
            {
                char key = inputString.charAt(i);

                if (!hashMap.containsKey(key))
                {
                    hashMap.put(key, 1);
                    output.append(key);    
                }
            }

            System.out.println(output.toString());
		}
		
		sc.close();
    }
}
