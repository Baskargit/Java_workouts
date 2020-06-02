import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            String inputString = sc.nextLine();
            int originalLength = inputString.length();

            for (int i = 0; i < inputString.length(); i++) 
            {
                char temp = inputString.charAt(i);
                if (Character.isAlphabetic(temp) && !(temp == 'a' || temp == 'A' || temp == 'e' || temp == 'E' || temp == 'i' || temp == 'I' || temp == 'o' || temp == 'O' || temp == 'u' || temp == 'U')) 
                {
                    originalLength--;
                    inputString = inputString.replace(temp, '\0');
                }    
            }

            StringBuilder outputString = new StringBuilder();

            for (int i = 0; i < inputString.length(); i++) 
            {
                if (inputString.charAt(i) != '\0') {
                    outputString.append(inputString.charAt(i));
                }    
            }

            System.out.println((originalLength > 0) ? outputString.toString() : "No Vowel");
            
            // for (int i = 65; i <= 90; i++) {
            //     inputString = inputString.replace(Character.toString((char)i), "");
            // }

            // for (int i = 97; i <= 122; i++) {
            //     inputString = inputString.replace(Character.toString((char)i), "");
            // }

            // System.out.println(inputString);
		}
		
		sc.close();
    }
}
