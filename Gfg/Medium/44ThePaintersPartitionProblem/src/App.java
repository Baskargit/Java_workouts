import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// https://practice.geeksforgeeks.org/problems/the-painters-partition-problem/0/?difficulty[]=1&page=3&query=difficulty[]1page3#
// Wrong Answer. !!!
// Invalid logic


public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String kn[] = bi.readLine().split(" ");
            
            int k = Integer.parseInt(kn[0]);
            int n = Integer.parseInt(kn[1]);

            String array[] = bi.readLine().split(" ");
            int lengths[] = new int[array.length];

            int maxLength = Integer.MIN_VALUE;

            for(int i = 0; i < array.length; i++)
            {
                lengths[i] = Integer.parseInt(array[i]);
                maxLength = (lengths[i] > maxLength) ? lengths[i] : maxLength;
            }

            int minTime = Integer.MAX_VALUE;

            if (k < n) 
            {
                // Increasing order
                Arrays.sort(lengths);

                ArrayList<Integer> possiblities = new ArrayList<Integer>();

                for (int i = 1; i <= n; i++)
                {
                    int tempPossiblities[] = new int[k];
                    int pos = 0;

                    for (int j = n - 1; j >= n - i; j--)
                    {
                        tempPossiblities[pos] += lengths[j];
                    }

                    pos++;

                    for (int j = n - 1 - i; j >= 0; j--)
                    {
                        if (pos >= k) 
                        {
                            tempPossiblities[k - 1] += lengths[j];    
                        }
                        else
                        {
                            int sum = tempPossiblities[pos] + lengths[j];

                            if (sum <= tempPossiblities[0]) 
                            {
                                tempPossiblities[pos] = sum;
                            }
                            else
                            {
                                if (pos + 1 < k) 
                                {
                                    tempPossiblities[++pos] += lengths[j];
                                }
                                else
                                {
                                    tempPossiblities[pos] = sum;
                                    pos++;
                                }   
                            }
                        }
                    }

                    int maxTime = Integer.MIN_VALUE;
                    for (int j = 0; j < k; j++) 
                    {
                        maxTime = (tempPossiblities[j] > maxTime) ? tempPossiblities[j] : maxTime;
                    }

                    possiblities.add(maxTime);
                }

                Collections.sort(possiblities);

                minTime = possiblities.get(0);
            }
            else
            {
                minTime = maxLength;
            }

            System.out.println(minTime);
		}
		
		bi.close();
    }

    public static int minTime(int k,int n,int boardLength[])
    {
        int minTime = Integer.MAX_VALUE;

        for(int i = 0; i < k; i++)
        {
            
        }

        return minTime;
    }
}

/**
Input:
26 44
274 465 130 135 254 45 70 122 149 95 453 65 392 331 316 484 372 339 45 46 31 167 351 415 387 275 355 440 290 462 436 416 279 66 403 33 464 473 8 113 420 461 30 312

Its Correct output is:
647

And Your Code's output is:
957
*/
