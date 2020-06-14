import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/remove-b-and-ac-from-a-given-string/0
// Execution Time:0.5

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String string = sc.next();
            int length = string.length();
            
            StringBuilder stringBuilder = new StringBuilder(string);

            stringBuilder = FindAndReplace(stringBuilder, length);

            for (int i = 0; i < stringBuilder.length(); i++) 
            {
                if (stringBuilder.charAt(i) != ' ') 
                {
                    System.out.print(stringBuilder.charAt(i));
                } 
            }
            
            System.out.println();
		}
		
		sc.close();
    }

    public static StringBuilder FindAndReplace(StringBuilder stringBuilder,int length)
    {
        for (int i = 0; i < length;) 
        {
            char ch = stringBuilder.charAt(i);

            if (ch == 'b') 
            {
                stringBuilder = stringBuilder.replace(i,i+1 ," ");
                
            }
            else
            {
                String ac = Character.toString(stringBuilder.charAt(i)) + ((i + 1 == length) ? null : Character.toString(stringBuilder.charAt(i+1))); 
                
                if (ac.compareTo("ac") == 0) {
                    stringBuilder = stringBuilder.replace(i,i+1 ," ");
                    stringBuilder = stringBuilder.replace(i+1,i+2 ," ");
                    i++;
                }
            }

            i++;
        }

        return stringBuilder;
    }
}
