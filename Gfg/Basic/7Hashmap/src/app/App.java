package app;

import java.util.HashMap;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/java-hashmap/0
// Execution Time : 0.34

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            sc.nextLine();

            String input = sc.nextLine();
            String searchFor = sc.nextLine();

            HashMap<String,Integer> hashMap = new HashMap<>();
            String splitted[] = input.split(" ");
            
            for (int i = 0; i < splitted.length; i += 2) 
            {
                hashMap.put(splitted[i], Integer.parseInt(splitted[i+1]));
            }

            Integer result = hashMap.get(searchFor);

            System.out.println((result != null) ? result.intValue() : -1);
        }
        
        sc.close();
    }
}