import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/merge-two-strings/0
// Execution Time:0.45

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String[] string = sc.nextLine().split(" ");

            int s1Len = string[0].length();
            int s2Len = string[1].length();
            
            StringBuilder stringBuilder = new StringBuilder();

            if (s1Len >= s2Len) 
            {
                for (int i = 0; i < s1Len; i++) 
                {
                    stringBuilder.append(string[0].charAt(i));

                    for (int j = i; j < s2Len;) 
                    {
                        stringBuilder.append(string[1].charAt(j));
                        break;
                    }    
                }    
            }
            else  {
                for (int i = 0; i < s1Len; i++) 
                {
                    stringBuilder.append(string[0].charAt(i));

                    if (i == s1Len - 1) 
                    {
                        for (int j = i; j < s2Len; j++) 
                        {
                            stringBuilder.append(string[1].charAt(j));
                        }    
                    }
                    else {
                        stringBuilder.append(string[1].charAt(i));
                    }                    
                }
            }

            System.out.println(stringBuilder.toString());
		}
		
		sc.close();
    }
}
