import java.util.HashMap;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/check-if-a-string-is-isogram-or-not/0
// Execution Time:0.15

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            String string = sc.next();
            
            HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();

            int isIso = 1;

            for (int i = 0; i < string.length(); i++) 
            {
                char key = string.charAt(i);

                if (hashMap.containsKey(key)) {
                    isIso = 0;
                    break;
                } else {
                    hashMap.put(key, 1);
                }
            }

            System.out.println(isIso);
		}
		
		sc.close();
    }
}
