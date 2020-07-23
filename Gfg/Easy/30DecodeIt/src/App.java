import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/decode-it/0
// Execution Time:0.22

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String inpStr = bi.readLine().trim();
            char inputString[] = inpStr.toCharArray();
            int k = Integer.parseInt(bi.readLine());

            char kChar = '\0';
            StringBuilder partialOutput = new StringBuilder();
            int prevPos = 0;
            boolean firstTime = true;

            for (int i = 0; i < inputString.length;i++) 
            {
                if (Character.isDigit(inputString[i])) 
                {
                    int repeat = Integer.parseInt(Character.toString(inputString[i]));

                    String subStr = inpStr.substring(prevPos, i);

                    if (firstTime) 
                    {
                        while (repeat > 0) { partialOutput.append(subStr); repeat--; }
                        firstTime = false;
                    }
                    else
                    {
                        String newString = partialOutput.toString() + subStr;
                        partialOutput.append(subStr); repeat--;

                        while (repeat > 0) { partialOutput.append(newString); repeat--; }
                    }

                    if (partialOutput.length() > k) {
                        kChar = partialOutput.charAt(k - 1);
                        break;
                    }

                    prevPos = i + 1;   
                }  
            }

            System.out.println(kChar);
		}
		
		bi.close();
    }
}

/**

Input:
l4a3mfy5t1dycee6ixq7
20

Its Correct output is:
l

And Your Code's output is:
f

Input:
kuy7clx3ns1imlsm2ps1vcxkc2
23

Its Correct output is:
l

And Your Code's output is:
u

 */