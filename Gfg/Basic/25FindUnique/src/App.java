import java.util.Hashtable;
import java.util.Scanner;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/problems/find-unique-element/0/
// Execution Time:0.25

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            int k = sc.nextInt();

            Hashtable<Integer,Integer> hashtable = new Hashtable<Integer,Integer>();

            for (int i = 0; i < n; i++) 
            {
                int key = sc.nextInt();
                
                if (hashtable.containsKey(key)) 
                {
                    hashtable.replace(key, hashtable.get(key) + 1);    
                }
                else
                {
                    hashtable.put(key, 1);
                }
            }

            for (Entry<Integer,Integer> entry : hashtable.entrySet()) 
            {
                if (entry.getValue() != k)
                {
                    System.out.println(entry.getKey());
                    break;  
                }    
            }
		}
		
		sc.close();
    }
}
