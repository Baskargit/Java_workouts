import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1/?difficulty[]=1&page=2&query=difficulty[]1page2#
// Execution Time:2.23

// Expected Time Complexity: O(N) Met
// Expected Auxiliary Space: O(N) Met 
// Ref Used to solve : https://www.geeksforgeeks.org/count-subarrays-equal-number-1s-0s/

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int arr[] = { 1, 1, 0, 0 }; 

        System.out.println(countSubarrWithEqualZeroAndOne(arr, arr.length));
    }

    static int countSubarrWithEqualZeroAndOne(int arr[], int N)
    {
        int count = 0;

        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            sum += (arr[i] == 0) ? -1 : 1;

            if (sum == 0) 
            {
                count++;    
            }
            
            if (hashMap.containsKey(sum)) 
            {
                count += hashMap.get(sum);
                hashMap.replace(sum, hashMap.get(sum) + 1);
            }
            else
            {
                hashMap.put(sum, 1);
            }
        }

        return count;
    }
}
