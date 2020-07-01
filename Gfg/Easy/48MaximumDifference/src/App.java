import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/maximum-difference/0
// Execution Time:0.89

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String array[] = bi.readLine().trim().split(" ");

            int numbers[] = new int[n];
            
            for (int i = 0; i < n; i++) 
            {
                int num = Integer.parseInt(array[i]);
                numbers[i] = num;
            }

            int maxDifference = numbers[1] - numbers[0];
            int minElement = numbers[0];

            for (int i = 0; i < n; i++)
            {
                if (numbers[i] - minElement > maxDifference) 
                {
                    maxDifference = numbers[i] - minElement;
                }

                if (numbers[i] < minElement) 
                {
                    minElement = numbers[i];
                }
            }

            System.out.println(maxDifference > 0 ? maxDifference : -1);
		}
		
		bi.close();
    }
}

/**
Input:
94
49 130 124 85 455 257 341 467 377 432 309 445 440 127 324 38 39 119 83 430 42 334 116 140 159 205 431 478 307 174 387 22 246 425 73 271 330 278 74 98 13 487 291 162 137 356 268 156 75 32 53 351 151 442 225 467 431 108 192 8 338 458 288 254 384 446 410 210 259 222 89 423 447 7 31 414 169 401 92 263 156 411 360 125 38 49 484 96 42 103 351 292 337 375

Its Correct output is:
477

And Your Code's output is:
474

Input:
94
344 24 88 315 4 449 201 459 119 81 297 299 282 90 299 10 158 473 123 39 293 39 180 191 158 459 192 316 389 157 12 203 135 273 56 329 147 363 387 376 434 370 143 345 417 382 499 323 152 22 200 58 477 393 390 76 213 101 11 4 370 362 189 402 290 256 424 3 86 183 286 89 427 118 258 333 433 170 155 222 190 477 330 369 193 426 56 435 50 442 13 146 61 219

Its Correct output is:
495

And Your Code's output is:
489
 */
