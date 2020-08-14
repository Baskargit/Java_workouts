import java.util.ArrayList;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
// Execution Time:6.27

public class App {
    public static void main(String[] args) throws Exception 
    {
        // Functional problem
    }

    public ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < A.length; i++) 
        {
            if (i < k) 
            {
                if (hashMap.containsKey(A[i]))
                {
                    hashMap.replace(A[i], hashMap.get(A[i]) + 1);
                }
                else
                {
                    hashMap.put(A[i], 1);
                }
                
                if (!arrayList.isEmpty()) 
                {
                    arrayList.set(0, hashMap.size());
                }
                else
                {
                    arrayList.add(hashMap.size());
                }
            }
            else
            {
                if (hashMap.containsKey(A[i - k])) 
                {
                    if (hashMap.get(A[i - k]) > 1) 
                    {
                        hashMap.replace(A[i - k], hashMap.get(A[i - k]) - 1);
                    }
                    else
                    {
                        hashMap.remove(A[i - k]);
                    }
                }

                if (hashMap.containsKey(A[i]))
                {
                    hashMap.replace(A[i], hashMap.get(A[i]) + 1);
                }
                else
                {
                    hashMap.put(A[i], 1);
                }

                arrayList.add(hashMap.size());
            }
        }

        return arrayList;
    }
}
