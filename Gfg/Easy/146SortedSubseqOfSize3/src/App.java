import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/sorted-subsequence-of-size-3/1
// Unsolved

public class App {
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);arr.add(2);arr.add(1);arr.add(1);arr.add(3);

        System.out.println(find3Numbers(arr, arr.size()));
    }

    public static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) 
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int currentIndex = 0;

        for (Integer number : arr) 
        {
            if (arr.contains(number - 1)) 
            {
                if (arr.contains(number + 1)) 
                {
                    int preIndex =  arr.indexOf(number - 1);
                    int nextIndex = arr.lastIndexOf(number + 1);

                    if (preIndex < currentIndex && nextIndex > currentIndex) 
                    {
                        arrayList.add(arr.get(preIndex));
                        arrayList.add(number);
                        arrayList.add(arr.get(nextIndex));
                        break;
                    }
                }    
            }

            currentIndex++;
        }

        return arrayList;
    }
}
