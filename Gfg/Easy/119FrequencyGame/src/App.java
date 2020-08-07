import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception 
    {
        int arr[] = new int[]{2,2,5,50,1};
        System.out.println(LargButMinFreq(arr, arr.length));
    }

    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n)
    {
        int largestNum = Integer.MIN_VALUE,minValue = Integer.MAX_VALUE;

        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < n; i++) 
        {
                if (hashMap.containsKey(arr[i])) {
                    hashMap.replace(arr[i], hashMap.get(arr[i]) + 1);    
                } else {
                    hashMap.put(arr[i], 1);
                }

                if (arr[i] > largestNum) 
                {
                    if (hashMap.get(arr[i]) <= minValue) 
                    {
                        largestNum = arr[i];
                        minValue = hashMap.get(arr[i]);
                    }    
                }
        }

        return largestNum;
    }
}
