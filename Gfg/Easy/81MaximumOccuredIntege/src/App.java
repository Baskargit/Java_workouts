import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/maximum-occured-integer/0
// TLE

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String stringL[] = bi.readLine().trim().split(" ");
            String stringR[] = bi.readLine().trim().split(" ");

            int numberL[] = new int[n];
            int numberR[] = new int[n];

            HashSet<Integer> hashSet = new HashSet<Integer>();
            
            TreeMap<Integer,Integer> hashMap = new TreeMap<Integer,Integer>();
            for (int i = 0; i < n; i++) 
            {
                numberL[i] = Integer.parseInt(stringL[i]);
                numberR[i] = Integer.parseInt(stringR[i]);

                hashMap.put(numberL[i], 0);
                hashMap.put(numberR[i], 0);

                hashSet.add(numberL[i]);
                hashSet.add(numberR[i]);
            }

            Integer numbers[] = hashSet.toArray(new Integer[hashSet.size()]);

            Arrays.sort(numbers);

            for (int i = 0; i < n; i++) 
            {
                int from = Arrays.binarySearch(numbers, numberL[i]);
                
                for (int j = from; ; j++) 
                {
                    hashMap.replace(numbers[j], hashMap.get(numbers[j]) + 1);

                    if (numbers[j] == numberR[i]) 
                    {
                        break;
                    }
                }
            }

            int result = 0;
            int maxOccurence = 0;
            for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) 
            {
                if (entry.getValue() > maxOccurence) 
                {
                    maxOccurence = entry.getValue();
                    result = entry.getKey();
                }
            }

            System.out.println(result);
		}
		
		bi.close();
    }
}

/**
Input:
84
206 229 10 453 204 6 23 618 268 659 348 242 431 107 17 428 14 1 177 40 257 304 252 290 150 179 890 660 22 51 802 216 494 163 792 702 458 122 53 649 599 29 33 402 332 38 352 3 218 135 214 295 511 108 154 181 144 235 214 200 551 35 521 249 119 157 348 232 527 278 324 53 10 7 632 96 482 116 441 435 287 128 28 74
887 916 336 493 422 28 60 927 427 737 369 430 531 124 136 803 59 168 457 43 374 920 538 325 371 527 981 874 171 282 926 328 506 730 858 896 546 368 365 751 809 179 585 652 400 61 369 13 587 540 571 379 602 903 493 757 281 442 690 620 730 118 772 676 928 857 354 966 684 625 872 830 20 369 716 150 724 246 452 556 489 229 351 501

Its Correct output is:
324

And Your Code's output is:
369
 */
