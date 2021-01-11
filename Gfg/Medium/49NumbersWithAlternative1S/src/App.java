import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/numbers-with-alternative-1s/0/?difficulty[]=1&page=3&query=difficulty[]1page3
// Execution Time:0.78

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            int num = 2;

            StringBuilder output = new StringBuilder();
            output.append(1);

            while (true) 
            {
                String binary =  Integer.toString(num, 2);

                if (binary.length() > n) 
                {
                    break;
                }

                char prev = '\0';
                boolean isAlternative = true;

                for (int i = binary.length() - 1; i >= 0; i--) 
                {
                    if (binary.charAt(i) == '1' && prev == '1') 
                    {
                        isAlternative = false;
                        break;
                    }

                    prev = binary.charAt(i);
                }

                if (isAlternative) 
                {
                    output.append(" " + num);
                }

                num++;
            }

            System.out.println(output.toString());
		}
		
		bi.close();
    }
}
