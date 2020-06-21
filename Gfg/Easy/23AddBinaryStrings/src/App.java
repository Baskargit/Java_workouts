import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// https://practice.geeksforgeeks.org/problems/add-binary-strings/0
// Execution Time:0.21

public class App {
    public static void main(String[] args) throws Exception
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String array[] = bi.readLine().trim().split(" ");
            String s1 = array[0];
            String s2 = array[1];

            if (s1.length() > s2.length()) 
            {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Collections.nCopies(s1.length() - s2.length(), '0').toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", ""));
                stringBuilder.append(s2);

                s2 = stringBuilder.toString();
            }
            else if (s2.length() > s1.length()) 
            {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Collections.nCopies(s2.length() - s1.length(), '0').toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", ""));
                stringBuilder.append(s1);

                s1 = stringBuilder.toString();
            }

            int remainder = 0;
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = s1.length() - 1; i >= 0; i--) 
            {
                int val = (s1.charAt(i) - '0') + (s2.charAt(i) - '0') + remainder;

                if (val <= 1) 
                {
                    stringBuilder.append(val);
                    remainder = 0;
                }
                else
                {
                    if (val == 2) 
                    {
                        stringBuilder.append(0);
                        remainder = 1; 
                    }
                    else
                    {
                        stringBuilder.append(1);
                        remainder = 1;
                    }
                }
            }

            if (remainder > 0) 
            {
                stringBuilder.append(1);
            }

            System.out.println(stringBuilder.reverse().toString());
		}
		
		bi.close();
    }
}
