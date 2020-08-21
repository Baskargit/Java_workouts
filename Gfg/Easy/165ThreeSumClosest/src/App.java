import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

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
                int diff = integer - target;

                sum = integer;

                if (integer > target) 
                {
                    break;
                }
            }    
        }

        return sum;
	} 
}
