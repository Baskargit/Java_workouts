import java.util.Arrays;
import java.util.TreeSet;

// https://practice.geeksforgeeks.org/problems/product-array-puzzle0852/1
// Expected Time Limit < 2.368sec

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    // Two-pointer approach
    public static int threeSumClosest1(int[] array, int target)  
    {
        int closest = 0;

        Arrays.sort(array);

        int i = 0, j = array.length -1, k = array.length - 1;

        

        return closest;
    }

    // Naive approach
    public static int threeSumClosest(int[] array, int target)  
	{ 
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        boolean isFound = false;

        int sum = 0;

        for (int i = 0; i < array.length; i++) 
        {
            for (int j = i + 1; j < array.length; j++) 
            {
                for (int k = j + 1; k < array.length; k++) 
                {
                    int temp = array[i] + array[j] + array[k];

                    if (temp == target) 
                    {
                        isFound = true;
                        sum = target;
                        i = j = k = array.length;
                        break;
                    }
                    else
                    {
                        treeSet.add(temp);
                    }
                }    
            }    
        }

        if (!isFound) 
        {
            int minDiff = Integer.MAX_VALUE;
            
            for (Integer integer : treeSet) 
            {
                int diff = Math.abs(integer - target);

                if (diff <= minDiff) 
                {
                    sum = integer;
                    minDiff = diff;    
                }
            }    
        }

        return sum;
	} 
}

/**
Input:
9 195
93 28 61 50 -9 35 35 22 97

Its Correct output is:
193

And Your Code's output is:
204

Input:
4 13
5 2 7 5

Its Correct output is:
14

And Your Code's output is:
12
 */
