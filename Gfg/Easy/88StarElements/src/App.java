import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/start-elements/0
// Execution Time:0.57

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int numbers[] = new int[n];

            int max = Integer.MIN_VALUE,maxIndex = -1;
            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);  
                
                if (numbers[i] >= max) 
                {
                    max = numbers[i];
                    maxIndex = i;    
                }
            }

            StringBuilder output = new StringBuilder();

            HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
            Integer starArray[] = new Integer[n - maxIndex];
            for (int i = maxIndex,superStarCounter = 0; i < n; i++) 
            {
                if (hashMap.containsKey(numbers[i])) 
                {
                    hashMap.replace(numbers[i], i);    
                }
                else
                {
                    hashMap.put(numbers[i], i);
                }

                starArray[superStarCounter++] = numbers[i];
            }

            // Sort in desc
            Arrays.sort(starArray,Collections.reverseOrder());

            int maxIndexSoFar = -1;
            for (int i = 0; i < starArray.length; i++) 
            {
                int index = hashMap.get(starArray[i]);

                if (index > maxIndexSoFar) 
                {
                    output.append(starArray[i] + " ");
                    maxIndexSoFar = index;
                }
            }

            // Super-start left
            boolean isSuperstar = true;
            for (int i = 0; i < maxIndex; i++) 
            {
                if (numbers[i] == max) 
                {
                    isSuperstar = false;
                    break;    
                }
            }

            output.append((isSuperstar) ? "\n" + max : "\n" + "-1");

            System.out.println(output.toString());
		}
		
		bi.close();
    }
}

/**
For Input:
2
10
1 6 5 4 7 8 4 3 2 1
9
1 2 10 3 4 5 8 10 4
Your Output is:
8 4 3 2 1 
8
10 4 
-1

Input:
84
87 78 16 94 36 87 93 50 22 63 28 91 60 64 27 41 27 73 37 12 69 68 30 83 31 63 24 68 36 30 3 23 59 70 68 94 57 12 43 30 74 22 20 85 38 99 25 16 71 14 27 92 81 57 74 63 71 97 82 6 26 85 28 37 6 47 30 14 58 25 96 83 46 15 68 35 65 44 51 88 9 77 79 89

Its Correct output is:
99 97 96 89
99

And Your Code's output is:
99 25 16 71 14 27 92 81 57 74 63 71 97 82 6 26 85 28 ...
 */
