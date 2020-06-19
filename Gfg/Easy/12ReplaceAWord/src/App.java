import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/replace-a-word/0
// Execution Time:0.14

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String inputString = bi.readLine();
            String replace = bi.readLine();
            String replaceBy = bi.readLine();

            int inputStringLength = inputString.length();
            int replaceLength = replace.length();

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < inputStringLength; i++) 
            {
                if (inputString.charAt(i) == replace.charAt(0)) 
                {
                    String subString = inputString.substring(i, (i+replaceLength < inputStringLength) ? i+replaceLength : inputStringLength);

                    if (subString.equals(replace)) 
                    {
                        stringBuilder.append(replaceBy);
                        i += replaceLength - 1;
                    }
                    else
                    {
                        stringBuilder.append(inputString.charAt(i));
                    }
                } 
                else {
                    stringBuilder.append(inputString.charAt(i));
                }    
            }

            System.out.println(stringBuilder.toString());
		}
		
		bi.close();
    }
}
