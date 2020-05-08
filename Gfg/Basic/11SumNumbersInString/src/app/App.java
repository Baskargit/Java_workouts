package app;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string/0/
// Execution Time:0.14

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
        int testcasecount = sc.nextInt();
		
		while(testcasecount-- > 0)
		{
            sc.nextLine();
            String inputString = sc.nextLine();
            
            long totalSum = 0;
            
            int i = 0,length = inputString.length();
            while (i < length) 
            {
                StringBuilder stringNumber = new StringBuilder();
                int j = i;

                while (j < length && inputString.charAt(j) >= '0' && inputString.charAt(j) <= '9') 
                {
                    stringNumber.append(inputString.charAt(j));
                    j++;
                }

                if (!stringNumber.toString().isEmpty()) {
                    int newNumber = Integer.parseInt(stringNumber.toString());
                    totalSum += newNumber;
                }
                
                i = j+1;
            }

            System.out.println(totalSum);
        }
        
        sc.close();
    }
}