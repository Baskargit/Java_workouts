import java.util.HashMap;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array/0/
// Execution Time:2.42

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
        int testcasecount = sc.nextInt();
        		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            
            HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

            for (int i = 0; i < n; i++) 
            {
                int temp = sc.nextInt();
                hashMap.put(temp, i);
            }

            int key = sc.nextInt();

            System.out.println(hashMap.containsKey(key) ? hashMap.get(key) : -1);
		}
		
		sc.close();
    }
}
