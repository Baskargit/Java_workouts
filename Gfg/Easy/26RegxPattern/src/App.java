import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/-regex-matching/0
// Execution Time:0.16

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String patternString = bi.readLine();
            String textString = bi.readLine();

            int result = 0;

            if (textString.length() >= patternString.length() - 1) 
            {
                if (patternString.contains("$")) 
                {
                    String subString = textString.substring(textString.length() - (patternString.length() - 1), textString.length());

                    String sub1 = patternString.substring(0, patternString.length() - 1);

                    if (subString.equals(sub1)) {
                        result = 1;
                    }
                }
                else if (patternString.contains("^")) 
                {
                    String subString = textString.substring(0, patternString.length() - 1);

                    String sub1 = patternString.substring(1, patternString.length());

                    if (subString.equals(sub1)) {
                        result = 1;
                    }
                }
                else 
                {
                    for (int i = 0; i < textString.length(); i++) 
                    {
                        if (textString.charAt(i) == patternString.charAt(0)) 
                        {
                            String subString = textString.substring(i, (i + patternString.length() < textString.length()) ? i + patternString.length() : textString.length());    
                        
                            if (subString.equals(patternString)) {
                                result = 1;
                                break;
                            }
                        }    
                    }
                }
            }
            else
            {
                result = 0;
            }

            System.out.println(result);
		}
		
		bi.close();
    }
}
