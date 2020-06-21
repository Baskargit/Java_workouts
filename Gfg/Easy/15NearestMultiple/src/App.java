import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/nearest-multiple-of-10/0
// Execution Time:0.24


public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String number = bi.readLine().trim();
            
            if (number.charAt(number.length() - 1) - '0' <= 5 ) 
            {
                System.out.println(number.substring(0, number.length() - 1) + '0');    
            }
            else
            {
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append('0');

                int remainder = 1;

                for (int i = number.length() - 2; i >= 0; i--) 
                {
                    if (number.charAt(i) - '0' + remainder < 10) 
                    {
                        stringBuilder.append(number.charAt(i) - '0' + remainder);
                        remainder = 0;
                    }
                    else
                    {
                        stringBuilder.append('0');
                    }
                }
                if (remainder == 1) 
                {
                    stringBuilder.append(remainder);    
                }

                System.out.println(stringBuilder.reverse().toString());
            }
		}
		
		bi.close();
    }
}
