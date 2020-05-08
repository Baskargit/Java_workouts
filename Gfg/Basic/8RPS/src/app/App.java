package app;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
        int testcasecount = sc.nextInt();
        sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String inpuString = sc.nextLine();
            
            if (inpuString.charAt(0) == 'R') {
                if (inpuString.charAt(1) == 'P') {
                    System.out.println("B");
                }
                else if (inpuString.charAt(1) == 'S') {
                    System.out.println("A");
                }
                else {
                    System.out.println("DRAW");
                }
            }
            else if (inpuString.charAt(0) == 'P') {
                if (inpuString.charAt(1) == 'R') {
                    System.out.println("A");
                }
                else if (inpuString.charAt(1) == 'S') {
                    System.out.println("B");
                }
                else {
                    System.out.println("DRAW");
                }
            }
            else {
                if (inpuString.charAt(1) == 'P') {
                    System.out.println("A");
                }
                else if (inpuString.charAt(1) == 'R') {
                    System.out.println("B");
                }
                else {
                    System.out.println("DRAW");
                }
            }
        }
        
        sc.close();
    }
}