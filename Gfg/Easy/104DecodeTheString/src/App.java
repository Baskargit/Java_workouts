import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/decode-the-string/0
// Execution Time:0.32

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char input[] = bi.readLine().trim().toCharArray();
            
            Stack<String> stack = new Stack<String>();
            
            StringBuilder pushContent = new StringBuilder();
            boolean canPop = false;
            
            for (int i = 0; i < input.length; i++) 
            {
            	if (input[i] == '[') 
            	{
					stack.push(pushContent.toString());
					pushContent.setLength(0);
				}
            	else if (input[i] == ']') 
            	{
            		if (pushContent.length() > 0) {
            			stack.push(pushContent.toString());
            			pushContent.setLength(0);
					}
            		
            		String string = stack.pop();
					char popContent[] = stack.pop().toCharArray();
					
					StringBuilder prefixString = new StringBuilder();
					StringBuilder number = new StringBuilder();
					
					for (int j = 0; j < popContent.length; j++) 
					{
						if (Character.isAlphabetic(popContent[j])) {
							prefixString.append(popContent[j]);
						} else {
							number.append(popContent[j]);
						}
					}
					
					int repeat = (number.length() > 0) ? Integer.parseInt(number.toString()) : 0;
					StringBuilder newContent = new StringBuilder();
					
					if (repeat == 0) {
						newContent.append(string);
					}
					
					for (int j = 0; j < repeat; j++) 
					{
						newContent.append(string);
					}
					
					if (canPop && stack.size() % 2 == 0) 
					{
						stack.push(stack.pop() + prefixString.toString() + newContent.toString());
					}
					else {
						stack.push(prefixString.toString() + newContent.toString());
					}
					
					canPop = (i + 1 < input.length) ? (input[i + 1] != ']') ? true : false : false;
				
					if (i == input.length - 1) {
						if (stack.size() > 1) {
							i--;
						}
					}
            	}
            	else 
            	{
					pushContent.append(input[i]);
				}
			}
            
            System.out.println(stack.pop());
		}
		
		bi.close();
    }
}

/** 
Input:
3[a2[bd]g4[ef]h]

Its Correct output is:
abdbdgefefefefhabdbdgefefefefhabdbdgefefefefh

And Your Code's output is:
3abdbdgefefefef

Input:
56[1[a4[bccd]2[c]]]

Its Correct output is:
abccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbccdbccdccabccdbccdbcc.................

And Your Code's output is:
a4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcca4[bccdcc
 */

/** => Old approach {wrong}
    char input[] = bi.readLine().trim().toCharArray();
    
    int iterateCount = 0;
    StringBuilder ic = new StringBuilder();
    int pos = 0,bracketCount = 0;
    for (pos = 0; pos < input.length; pos++) 
    {
        if (input[pos] == '[') {
            iterateCount = Integer.parseInt(ic.toString());
            pos++;
            break;
        }
        else {
            ic.append(input[pos]);
        }
    }

    for (int i = 0; i < input.length; i++) 
    {
        bracketCount += (input[i] == '[' || input[i] == ']') ? 1 : 0;    
    }

    StringBuilder output = new StringBuilder();
    
    if (iterateCount > 0) 
    {
        StringBuilder tempOutput = new StringBuilder();

        if (bracketCount > 2) 
        {
            while (iterateCount > 0) 
            {
                while (pos < input.length - 1) 
                {
                    // Get prefixString
                    StringBuilder prefixString = new StringBuilder();
                    while (pos < input.length && Character.isAlphabetic(input[pos])) { prefixString.append(input[pos++]); }
                    
                    // Get Multiplier
                    StringBuilder multString = new StringBuilder();
                    while (pos < input.length && Character.isDigit(input[pos])) { multString.append(input[pos++]); }
                    int multiplier = (multString.length() > 0) ? Integer.parseInt(multString.toString()) : 1;

                    // Get MultiplierString
                    pos++;
                    StringBuilder multiplierString = new StringBuilder();
                    while (pos < input.length && input[pos] != ']') { multiplierString.append(input[pos++]); }

                    tempOutput.append(prefixString);
                    while (multiplier > 0) {
                        tempOutput.append(multiplierString);
                        multiplier--;
                    }

                    pos++;
                }

                output.append(tempOutput);
                iterateCount--;    
            }
        }
        else
        {
            StringBuilder multiplierString = new StringBuilder();
            while (input[pos] != ']') { multiplierString.append(input[pos++]); }

            while (iterateCount-- > 0)
            {
                output.append(multiplierString);
            }
        }    
    }

    System.out.println(output.toString());
 */