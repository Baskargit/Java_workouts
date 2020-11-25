/**
https://www.geeksforgeeks.org/longest-monotonically-increasing-subsequence-size-n-log-n/
http://lightoj.com/article_show.php?article=1000&language=english&type=pdf
*/

// Not completed

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception 
    {
        int[] a = new int[] {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};

        System.out.println(longestSubsequence(a.length, a));
    }

    public static int longestSubsequence(int size, int a[])
    {
        int b[] = a.clone();

        Arrays.sort(b);

        int length = 0;

        return length;
    }
}
