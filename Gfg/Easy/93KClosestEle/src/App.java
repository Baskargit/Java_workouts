import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/k-closest-elements/0
// Execution Time:0.28

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            String kx[] = bi.readLine().trim().split(" ");
            int k = Integer.parseInt(kx[0]);
            int x = Integer.parseInt(kx[1]);

            int numbers[] = new int[n];
            int xPos = -1;
            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);

                if (numbers[i] == x) {
                    xPos = i;
                }
            }

            StringBuilder output = new StringBuilder(); 
            
            int counter = 0;
            Stack<Integer> leftStack = new Stack<Integer>();
            ArrayList<Integer> rightQueue = new ArrayList<Integer>();

            for (int left = xPos - 1,right = xPos + 1; left >=0 || right < n; ) 
            {
                if (left >= 0) {
                    leftStack.push(numbers[left--]); counter++;
                }
                if (counter == k) { break; }

                if (right < n) {
                    rightQueue.add(numbers[right++]); counter++;
                }
                if (counter == k) { break; }
            }

            int size = leftStack.size();
            for (int i = 0; i < size; i++) { output.append(leftStack.pop() + " "); }
            for (Integer integer : rightQueue) { output.append(integer + " "); }
            
            System.out.println(output.toString());
		}
		
		bi.close();
    }
}

/**
Input:
42
36 146 154 170 282 293 300 323 335 359 383 392 422 437 448 465 468 479 492 501 539 605 668 704 706 717 719 725 727 772 812 828 828 870 895 896 903 913 943 962 963 996
8 717

Its Correct output is:
605 668 704 706 719 725 727 772

And Your Code's output is:
706 704 668 605 719 725 727 772

Input:
51
5 65 86 136 153 165 167 175 195 217 250 279 282 290 334 337 338 338 338 374 394 397 420 451 506 566 569 573 586 592 609 610 612 616 624 637 641 653 665 715 738 806 820 827 877 911 926 942 944 950 971
2 971

Its Correct output is:
944 950

And Your Code's output is:
926 942 944 950

 */
