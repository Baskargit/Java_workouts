package app;

import java.util.Hashtable;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/uncommon-characters/0/
// 

public class App 
{
    public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
        //sc.nextLine();
        
		while(testcasecount-- > 0)
		{
            sc.nextLine();
            String s1 = sc.nextLine();
            
            System.out.println("s1 : " + s1);

            //sc.nextLine();
            String s2 = sc.nextLine();

            System.out.println("s2 : " + s2);

            Hashtable<Integer,Character> hashtable = new Hashtable<Integer,Character>();

            StringBuilder outputString = new StringBuilder();
            
            Character character = null;
            Integer index = -1;
            for (int i = 0; i < s1.length(); i++)
            {
                character = s1.charAt(i);
                Character result =  hashtable.put(character - 'a', character);

                // if (result == null) {
                //     outputString.append(character);
                // }else {
                //     index = outputString.indexOf(result.toString());

                //     if (index >= 0) {
                //         outputString = outputString.deleteCharAt(index);
                //     }
                    
                // }
            }

            for (int i = 0; i < s2.length(); i++) 
            {
                character = s2.charAt(i);
                Character result =  hashtable.put(character - 'a', character);

                if (result == null) {
                    outputString.append(character);
                }else {
                    index = outputString.indexOf(result.toString());

                    if (index >= 0) {
                        outputString = outputString.deleteCharAt(index);
                    }
                }
            }

            System.out.println(outputString);
		}
	 }
}