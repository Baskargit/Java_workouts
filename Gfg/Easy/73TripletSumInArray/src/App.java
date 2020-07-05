import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/triplet-sum-in-array/0
// Execution Time:0.96

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String nx[] = bi.readLine().trim().split(" ");
            int n = Integer.parseInt(nx[0]);
            int x = Integer.parseInt(nx[1]);

            String string[] = bi.readLine().trim().split(" ");

            int numbers[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);    
            }

            Arrays.sort(numbers);

            int tillIndex = 0;
            for (int i = 0; i < n; i++) 
            {
                tillIndex = i;
                if (numbers[i] > x) 
                {
                    break;    
                }    
            }

            boolean isFound = false;

            if (tillIndex >= 3) 
            {
                for (int i = 0; i < tillIndex; i++) 
                {
                    for (int j = i + 1; j < tillIndex; j++) 
                    {
                        for (int j2 = j + 1; j2 < tillIndex; j2++) 
                        {
                            if (numbers[i] + numbers[j] + numbers[j2] == x) 
                            {
                                isFound = true;
                                break;    
                            }
                        }
                    }
                }
            }

            System.out.println(isFound ? 1 : 0);
		}
		
		bi.close();
    }
}

/**
Input:
24 986
557 217 627 358 527 358 338 272 870 362 897 23 618 113 718 697 586 42 424 130 230 566 560 933

Its Correct output is:
1

And Your Code's output is:
0
 */