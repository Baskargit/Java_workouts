import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int heights[] = new int[n];

            

            for (int i = 0; i < n; i++) 
            {
                heights[i] = Integer.parseInt(string[i]);
            }

            int collectableCapacity = 0;
            int maxHeightSoFar = heights[0];
            int tempCapacity = 0;

            for (int i = 1; i < n; i++) 
            {
                if (heights[i] < maxHeightSoFar) 
                {
                    tempCapacity += maxHeightSoFar - heights[i];
                }
                else
                {
                    collectableCapacity += tempCapacity;
                    maxHeightSoFar = heights[i];
                    tempCapacity = 0;
                }
            }

            System.out.println(collectableCapacity);
		}
		
		bi.close();
    }
}

/**
Input:
41
467 334 500 169 724 478 358 962 464 705 145 281 827 961 491 995 942 827 436 391 604 902 153 292 382 421 716 718 895 447 726 771 538 869 912 667 299 35 894 703 811

Its Correct output is:
11141

And Your Code's output is:
3936

 */
