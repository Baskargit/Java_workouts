import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/largest-even-number/0
// Execution Time:0.29

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String input = bi.readLine().trim();
            Character number[] = input.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
            
            Arrays.sort(number);

            if ((number[0] - '0') % 2 != 0) 
            {
                int point = 0;

                for (int j = 0; j < number.length; j++) 
                { 
                    point = j; 

                    if ((number[j] - '0') % 2 == 0) {
                        break;
                    }
                }

                if (point + 1 != number.length || ((number[number.length - 1] - '0') % 2 == 0)) 
                {
                    char temp = number[point];

                    for (int j = point; j > 0; j--) 
                    {
                        number[j] = number[j - 1];
                    }

                    number[0] = temp;
                }
            }

            StringBuilder output = new StringBuilder();

            for (int i = number.length - 1; i >= 0; i--) 
            {
                output.append(number[i]);
            }

            System.out.println(output.toString());
		}
		
		bi.close();
    }
}

/**
Input:
85375

Its Correct output is:
75538

And Your Code's output is:
87553
 */
