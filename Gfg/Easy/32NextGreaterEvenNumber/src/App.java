import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/next-greater-even-number/0
// Expected Time Limit < 3.208sec

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String numString = bi.readLine().trim();
            int len = numString.length();
            int sourceCount[] = new int[10];

            for (int i = 0; i < len; i++) 
            {
                sourceCount[numString.charAt(i) - '0']++;
            }

            long number = Long.parseLong(numString);
            long tempNum = number + 1;
                        
            boolean isFound = false;
            long nextGreaterNum = 0;

            while (true) 
            {
                if (tempNum % 2 == 0) 
                {
                    char array[] = String.valueOf(tempNum).toCharArray();

                    if (array.length == len) 
                    {
                        if (isNextGreaterNum(number, sourceCount, tempNum)) 
                        {
                            isFound = true;
                            nextGreaterNum = tempNum;
                            break;
                        }
                    }
                    else
                    {
                        break;
                    }
                }
                tempNum++;
            }
            

            System.out.println(isFound ? nextGreaterNum : -1);
		}
		
		bi.close();
    }

    public static boolean isNextGreaterNum(long sourceNum,int sourceCount[],long currentNum)
    {
        String str = String.valueOf(currentNum);
        int len = str.length();
        int count[] = new int[10];

        boolean result = true;

        for (int i = 0; i < len; i++) 
        {
            count[str.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) 
        {
            if (count[i] != sourceCount[i]) 
            {
                return false;    
            }
        }

        return result;
    }
}
