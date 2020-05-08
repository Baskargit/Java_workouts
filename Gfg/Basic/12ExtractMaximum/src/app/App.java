package app;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/extract-maximum/0/
// Execution Time:0.16

public class App {
    public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
        sc.nextLine();
        
		while(testcasecount-- > 0)
		{
            String inputString = sc.nextLine();

            long maxNumber = 0;
            
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
                    
                    maxNumber = (newNumber > maxNumber) ? newNumber : maxNumber;
                }
                
                i = j+1;
            }

            System.out.println(maxNumber);
		}
	 }
}