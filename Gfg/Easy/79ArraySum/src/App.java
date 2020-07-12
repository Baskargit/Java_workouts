import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

// https://practice.geeksforgeeks.org/problems/sum-of-two-numbers-represented-as-arrays/0
// Execution Time:2.3

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String nm = bi.readLine();

            String n1 = bi.readLine().trim().replaceAll(" ", "");
            String n2 = bi.readLine().trim().replaceAll(" ", "");

            BigInteger num1 = new BigInteger(n1);
            BigInteger num2 = new BigInteger(n2);

            BigInteger sum = num1.add(num2);

            StringBuilder output = new StringBuilder();

            for (char ch : sum.toString().toCharArray()) {
                output.append(ch + " ");
            }

            int leadingzeros = 0;

            if (n1.length() > n2.length()) 
            {
                for (int i = 0; i < n1.length(); i++) 
                {
                    if (n1.charAt(i) == '0') {
                        leadingzeros++;
                    }
                    else
                    {
                        break;
                    }   
                }
            }
            else
            {                
                for (int i = 0; i < n2.length(); i++) 
                {
                    if (n2.charAt(i) == '0') {
                        leadingzeros++;
                    }
                    else
                    {
                        break;
                    }   
                }
            }

            if (leadingzeros > 0) 
            {
                StringBuilder zeros = new StringBuilder();

                for (int i = 0; i < leadingzeros; i++) 
                {
                    zeros.append("0 ");    
                }

                System.out.println(zeros.toString() + output.toString());
            }
            else
            {
                System.out.println(output.toString());
            }

		}
		
		bi.close();
    }
}

/**
Input:
245 25
0 6 5 0 8 3 0 2 2 6 7 1 4 1 0 5 2 3 3 4 7 8 4 2 6 8 7 1 7 3 2 2 0 1 5 5 6 7 1 3 8 2 7 3 6 3 4 7 5 6 9 2 8 2 4 1 6 8 5 4 4 4 8 1 1 0 3 5 8 9 9 0 9 2 8 3 0 1 4 5 4 1 5 4 6 8 7 4 9 3 5 6 2 8 3 6 6 6 5 5 7 3 1 9 8 9 7 2 2 6 2 1 5 9 4 7 8 9 9 5 2 2 2 7 1 8 4 1 0 9 8 5 7 8 4 5 5 9 7 5 6 3 1 9 4 4 6 6 1 2 9 8 1 0 4 5 3 2 8 2 0 1 7 2 7 9 1 8 0 5 5 0 0 1 8 5 8 1 4 7 5 1 2 0 1 7 5 9 1 3 5 9 3 2 1 5 9 7 4 5 4 2 7 4 5 5 5 9 8 5 5 1 6 9 9 7 2 8 9 3 1 1 1 6 8 9 8 6 1 1 3 1 1 9 6 7 2 1 5 5 8 9 1 0 4
4 8 3 6 3 3 1 1 2 3 9 3 0 6 0 6 2 6 4 3 1 2 9 3 2

Its Correct output is:
0 6 5 0 8 3 0 2 2 6 7 1 4 1 0 5 2 3 3 4 7 8 4 2 6 8 7 1 7 3 2 2 0 1 5 5 6 7 1 3 8 2 7 3 6 3 4 7 5 6 9 2 8 2 4 1 6 8 5 4 4 4 8 1 1 0 3 5 8 9 9 0 9 2 8 3 0 1 4 5 4 1 5 4 6 8 7 4 9 3 5 6 2 8 3 6 6 6 5 5 7 3 1 9 8 9 7 2 2 6 2 1 5 9 4 7 8 9 9 5 2 2 2 7 1 8 4 1 0 9 8 5 7 8 4 5 5 9 7 5 6 3 1 9 4 4 6 6 1 2 9 8 1 0 4 5 3 2 8 2 0 1 7 2 7 9 1 8 0 5 5 0 0 1 8 5 8 1 4 7 5 1 2 0 1 7 5 9 1 3 5 9 3 2 1 5 9 7 4 5 4 2 7 4 5 5 5 9 8 5 5 1 6 9 9 7 2 8 9 3 5 9 5 3 2 2 9 7 3 5 2 4 2 5 7 3 4 7 9 9 0 2 0 3 6

And Your Code's output is:
6 5 0 8 3 0 2 2 6 7 1 4 1 0 5 2 3 3 4 7 8 4 2 6 8 7 1 7 3 2 2 0 1 5 5 6 7 1 3 8 2 7 3 6 3 4 7 5 6 9 2 8 2 4 1 6 8 5 4 4 4 8 1 1 0 3 5 8 9 9 0 9 2 8 3 0 1 4 5 4 1 5 4 6 8 7 4 9 3 5 6 2 8 3 6 6 6 5 5 7 3 1 9 8 9 7 2 2 6 2 1 5 9 4 7 8 9 9 5 2 2 2 7 1 8 4 1 0 9 8 5 7 8 4 5 5 9 7 5 6 3 1 9 4 4 6 6 1 2 9 8 1 0 4 5 3 2 8 2 0 1 7 2 7 9 1 8 0 5 5 0 0 1 8 5 8 1 4 7 5 1 2 0 1 7 5 9 1 3 5 9 3 2 1 5 9 7 4 5 4 2 7 4 5 5 5 9 8 5 5 1 6 9 9 7 2 8 9 3 5 9 5 3 2 2 9 7 3 5 2 4 2 5 7 3 4 7 9 9 0 2 0 3 6
 */