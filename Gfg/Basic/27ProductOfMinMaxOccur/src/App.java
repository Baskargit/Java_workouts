import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/difference-between-highest-and-lowest-occurrence/0/
// Execution Time:1.26

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();

            TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
            
            for (int i = 0; i < n; i++) 
            {
                int key = sc.nextInt();

                if (treeMap.containsKey(key)) {
                    treeMap.replace(key, treeMap.get(key) + 1);
                }
                else {
                    treeMap.put(key, 1);
                }
            }

            int minFreq = Integer.MAX_VALUE;
            int maxFreq = Integer.MIN_VALUE;

            for ( Map.Entry<Integer,Integer> entry : treeMap.entrySet()) 
            {
                minFreq = (entry.getValue() < minFreq) ? entry.getValue() : minFreq;
                maxFreq = (entry.getValue() > maxFreq) ? entry.getValue() : maxFreq;
            }

            System.out.println(maxFreq - minFreq);
		}
		
		sc.close();
    }
}
