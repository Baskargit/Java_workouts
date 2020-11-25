// https://practice.geeksforgeeks.org/problems/number-following-a-pattern/0/?difficulty[]=1&page=2&query=difficulty[]1page2
// Unsolved

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            
		}
		
		bi.close();
    }
}

/**

char tempInputArray[] = bi.readLine().trim().toCharArray();

char array[] = new char[tempInputArray.length + 1];

for (int i = 0; i < tempInputArray.length; i++) 
{
    array[i] = tempInputArray[i];    
}

array[array.length - 1] = tempInputArray[tempInputArray.length - 1];

System.out.println(array);

StringBuilder stringBuilder = new StringBuilder();

for (int i = 0; i < array.length; i++) 
{
    stringBuilder.append(1);
}

long start = Long.parseLong(stringBuilder.toString());

Stack<Long> stack = new Stack<Long>();

while (true) 
{
    long temp = start;

    HashSet<Long> check = new HashSet<Long>();

    boolean proceed = true;

    while (temp != 0) 
    {
        long t = temp % 10;

        if (t == 0 || check.contains(t)) 
        {
            proceed = false;
            break;
        }
        else
        {
            check.add(t);
            stack.push(temp % 10);
            temp /= 10;
        }
    }

    if (proceed) 
    {
        boolean isFound = true;

        char lastChar = array[0];
        long lastnumber = stack.pop();

        for (int i = 1; i < array.length; i++) 
        {
            long currentNumber = stack.pop();

            if (lastChar == 'D')
            {
                if ((array[i] == 'D' && currentNumber < lastnumber) || array[i] == 'I') 
                {
                    lastnumber = currentNumber;
                    lastChar = array[i];
                }
                else
                {
                    isFound = false;
                    break;
                }
            }
            else
            {
                if ((array[i] == 'I' && currentNumber > lastnumber) || array[i] == 'D')
                {
                    lastnumber = currentNumber;
                    lastChar = array[i];
                }
                else
                {
                    isFound = false;
                    break;
                }
            }
        }

        if (isFound) 
        {
            break;    
        }
    }

    stack.clear();
    start++;
}

System.out.println(start);

*/