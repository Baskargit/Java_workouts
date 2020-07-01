import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/sum-of-lengths-of-non-overlapping-subarrays/0
// Execution Time:0.25

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            // 1 -> Get Input
            int n = Integer.parseInt(bi.readLine().trim());

            String array[] = bi.readLine().trim().split(" ");
            int numbers[] = new int[array.length];
            for (int i = 0; i < array.length; i++) 
            {
                numbers[i] = Integer.parseInt(array[i]);    
            }

            int k = Integer.parseInt(bi.readLine().trim());

            // 2 -> Find out sumOfLength with constrains
            int sumOfLength = 0;
            int tempArrayLength = 0;
            boolean isMaxFound = false;

            for (int i = 0; i < numbers.length; i++) 
            {
                if (numbers[i] < k) 
                {
                    tempArrayLength++;
                }
                else if(numbers[i] == k)
                {
                    tempArrayLength++;
                    isMaxFound = true;
                }
                else
                {
                    sumOfLength += (isMaxFound) ? tempArrayLength : 0;
                    tempArrayLength = 0;
                    isMaxFound = false;
                }
            }

            sumOfLength += (isMaxFound) ? tempArrayLength : 0;

            // 4 => Print result
            System.out.println(sumOfLength);
		}
		
		bi.close();
    }
}

/**
Input:
93
513 3 534 24 26 541 30 32 550 551 56 60 70 586 589 590 597 607 611 613 616 105 623 626 627 630 634 128 643 648 659 163 678 168 371 193 203 211 728 221 734 751 240 760 761 763 257 265 266 782 786 789 279 280 281 797 292 295 812 317 327 847 336 851 348 364 883 889 379 893 894 897 898 387 907 398 919 920 409 924 413 926 417 582 429 942 949 440 958 468 473 101 339
292

Its Correct output is:
1

And Your Code's output is:
17

 */
