import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;

// https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
// Execution Time:0.67

// Expected Time Complexity: O(nLogn) => Not met
// Expected Auxiliary Space: O(n) => met

public class App
{
    public static void main(String[] args) throws Exception 
    {
        // int arr[] = new int[] {940, 950, 1100, 1500, 1800,900};
        // int dep[] = new int[] {1200,1120, 1130, 1900, 2000,910};

        int arr[] = new int[] {900, 1100, 1235};
        int dep[] = new int[] {1000, 1200, 1240}; 

        System.out.println(findPlatform(arr, dep, arr.length));
    }

    public static int findPlatform(int arr[], int dep[], int n)
    {
        int minPlatform = 0;

        timings timingList[] = new timings[n];
        
        for (int i = 0; i < n; i++) 
        {
            timingList[i] = new timings(arr[i], dep[i]);
        }

        Arrays.sort(timingList,new Comparator<timings>()
        {
            @Override
            public int compare(timings o1, timings o2) 
            {
                return o1.arrivalTime - o2.arrivalTime;
            }
        });

        ArrayList<timings> platformList = new ArrayList<timings>();

        for (int i = 0; i < n; i++) 
        {
            if (platformList.isEmpty()) 
            {
                platformList.add(timingList[i]);
            }
            else
            {
                ListIterator<timings> pIterator = platformList.listIterator();

                while (pIterator.hasNext()) 
                {
                    timings t = pIterator.next();

                    if (t.departureTime < timingList[i].arrivalTime) 
                    {
                        pIterator.remove();
                    }
                }

                platformList.add(timingList[i]);
            }

            minPlatform = (platformList.size() > minPlatform) ? platformList.size() : minPlatform;
        }

        return minPlatform;
    }
}

class timings
{
    int arrivalTime;
    int departureTime;
    
    public timings(int arrivalTime, int departureTime)
    {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
}
