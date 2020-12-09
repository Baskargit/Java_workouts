import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/longest-even-length-substring/0/?difficulty[]=1&page=2&query=difficulty[]1page2#
// Execution Time:0.15

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char input[] = bi.readLine().trim().toCharArray();
            
            int array[] = new int[input.length];
            
            for (int i = 0; i < array.length; i++) 
            {
                array[i] = Integer.parseInt(Character.toString(input[i]));
            }

            long maxLength = 0;

            for (int i = 0; i < array.length; i++) 
            {
                int tempSum = array[i],length = 1;

                for (int j = i + 1; j < array.length; j++) 
                {
                    tempSum += array[j];

                    if (++length % 2 == 0) 
                    {
                        int rightSum = tempSum, leftSum = 0,len = 0;

                        for (int k = i; k <= j; k++) 
                        {
                            rightSum -= array[k];
                            leftSum += array[k];
                            len++;

                            if (rightSum == leftSum && len == length/2)
                            {
                                maxLength = (length > maxLength) ? length : maxLength;
                            }
                        }
                    }
                    
                } 
            }

            System.out.println(maxLength);
		}
		
		bi.close();
    }
}

/*
Input:
123123

Its Correct output is:
6

And Your Code's output is:
3

Input:
740948824551711527614232216857618927954312

Its Correct output is:
36

And Your Code's output is:
38

*/
