package app;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/the-counting-game/0
//Execution Time:0.33

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
        int testcasecount = sc.nextInt();
        sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String inputString = sc.nextLine();            
            System.out.println(inputString.chars().filter(ch -> Character.isUpperCase(ch)).count() + 1);
        }
        
        sc.close();
    }
}