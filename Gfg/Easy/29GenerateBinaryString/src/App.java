import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

// https://practice.geeksforgeeks.org/problems/generate-binary-string/0
// Execution Time:1.92

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String inputString = bi.readLine().trim();
            int length = inputString.length();
            
            int powerOf = 0;

            for (int i = 0; i < inputString.length(); i++) 
            {
                powerOf += (inputString.charAt(i) == '?') ? 1 : 0;    
            }

            StringBuilder output = new StringBuilder();

            for (int i = 0; i < Math.pow(2, powerOf); i++) 
            {
                String combination = String.format("%016d", new BigInteger(Integer.toBinaryString(i))).substring(16-powerOf, 16);

                char replaced[] = inputString.toCharArray();
                int counter = 0;

                for (int j = 0; j < length; j++) 
                {
                    if (replaced[j] == '?') 
                    {
                        replaced[j] = combination.charAt(counter++);
                    }
                }

                output.append(String.valueOf(replaced) + " ");
            }

            System.out.println(output.toString());
		}
		
		bi.close();
    }
}

/**
Oup : 10000101 10000101 10000101 10000101 11101101 11101101 11101101 11101101
Req : 10000101 10001101 10100101 10101101 11000101 11001101 11100101 11101101
 */